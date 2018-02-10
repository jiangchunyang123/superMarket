/*   1:    */ package QRCode.compnents;
/*   2:    */ 
import QRCode.base.DateUtils;
/*   3:    */ import java.awt.BorderLayout;
/*   4:    */ import java.awt.Color;
/*   5:    */ import java.awt.Dimension;
/*   6:    */ import java.awt.FlowLayout;
/*   7:    */ import java.awt.Frame;
/*   8:    */ import java.awt.GridLayout;
/*   9:    */ import java.awt.Point;
/*  10:    */ import java.awt.Toolkit;
/*  11:    */ import java.awt.event.ActionEvent;
/*  12:    */ import java.awt.event.ActionListener;
/*  13:    */ import java.awt.event.ItemEvent;
/*  14:    */ import java.awt.event.ItemListener;
/*  15:    */ import java.awt.event.MouseAdapter;
/*  16:    */ import java.awt.event.MouseEvent;
/*  17:    */ import java.util.Calendar;
/*  18:    */ import java.util.Random;
/*  19:    */ import javax.swing.BorderFactory;
/*  20:    */ import javax.swing.JButton;
/*  21:    */ import javax.swing.JComboBox;
/*  22:    */ import javax.swing.JDialog;
/*  23:    */ import javax.swing.JLabel;
/*  24:    */ import javax.swing.JPanel;

/*  25:    */ 
/*  26:    */ public class JCalendarChooser
/*  27:    */   extends JDialog
/*  28:    */   implements ActionListener, ItemListener
/*  29:    */ {
/*  30:    */   private static final long serialVersionUID = 1L;
/*  31:    */   private static  MyDatePicker datePicker;
/*  32:    */   public JCalendarChooser(Frame parent)
/*  33:    */   {
/*  34: 50 */     super(parent, true);
/*  35: 51 */     setTitle(this.title);
/*  36:    */     
/*  37: 53 */     initDatas();
/*  38:    */   }
                public JCalendarChooser(Frame parent, String title,MyDatePicker filed)
/*  33:    */   {
/*  34: 50 */     super(parent, true);
/*  35: 51 */     setTitle(this.title);
/*  36:    */     datePicker = filed;
/*  37: 53 */     initDatas();
/*  38:    */   }
/*  39:    */   
/*  40:    */   public JCalendarChooser(Frame parent, Point location)
/*  41:    */   {
/*  42: 66 */     super(parent, true);
/*  43: 67 */     setTitle(this.title);
/*  44: 68 */     this.location = location;
/*  45:    */     
/*  46: 70 */     initDatas();
/*  47:    */   }
/*  48:    */   
/*  49:    */   public JCalendarChooser(Frame parent, String title, Point location)
/*  50:    */   {
/*  51: 85 */     super(parent, title, true); 
/*  52: 86 */     this.location = location;
/*  53:    */     
/*  54: 88 */     initDatas();
/*  55:    */   }
/*  56:    */   
/*  57:    */   public JCalendarChooser(Frame parent, String title)
/*  58:    */   {
/*  59:101 */     super(parent, title, true);
/*  60:    */     
/*  61:103 */     initDatas();
/*  62:    */   }
/*  63:    */   
/*  64:    */   private Dimension getStartDimension(int width, int height)
/*  65:    */   {
/*  66:115 */     Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
/*  67:116 */     dim.width = (dim.width / 2 - width / 2);
/*  68:117 */     dim.height = (dim.height / 2 - height / 2);
/*  69:118 */     return dim;
/*  70:    */   }
/*  71:    */   
/*  72:    */   private void initDatas()
/*  73:    */   {
/*  74:125 */     this.chooser = this;
/*  75:126 */     this.mdcEvent = new MouseDoubleClickedEvent();
/*  76:127 */     this.calendar = Calendar.getInstance();
/*  77:128 */     this.year1 = this.calendar.get(1);
/*  78:129 */     this.month1 = this.calendar.get(2);
/*  79:130 */     this.day1 = this.calendar.get(5);
/*  80:131 */     this.years = new String[100];
/*  81:132 */     this.months = new String[12];
/*  82:    */     
/*  83:134 */     this.label1 = new JLabel();
/*  84:135 */     this.label1.setForeground(Color.MAGENTA);
/*  85:137 */     for (int i = 0; i < this.months.length; i++) {
/*  86:138 */       this.months[i] = (" " + formatDay(i + 1));
/*  87:    */     }
/*  88:141 */     int start = this.year1 - 50;
/*  89:142 */     for (int i = start; i < start + 100; i++) {
/*  90:143 */       this.years[(i - start)] = String.valueOf(i);
/*  91:    */     }
/*  92:146 */     setInfo("当前日期: " + this.year1 + "-" + 
/*  93:147 */       formatDay(this.month1 + 1) + "-" + formatDay(this.day1) + 
/*  94:148 */       "              ", Color.BLUE);
/*  95:    */   }
/*  96:    */   
/*  97:    */   private void showDialog()
/*  98:    */   {
/*  99:157 */     setLayout(new BorderLayout());
/* 100:    */     
/* 101:159 */     JPanel panel3 = new JPanel();
/* 102:160 */     panel3.setLayout(new FlowLayout(1));
/* 103:161 */     showNorthPanel(panel3);
/* 104:162 */     add(panel3, "North");
/* 105:    */     
/* 106:164 */     add(printCalendar(), "Center");
/* 107:    */     
/* 108:166 */     JPanel panel2 = new JPanel();
/* 109:167 */     panel2.setLayout(new FlowLayout(2));
/* 110:168 */     showSouthPanel(panel2);
/* 111:169 */     add(panel2, "South");
/* 112:    */     
/* 113:171 */     setResizable(false);
/* 114:    */     
/* 115:173 */     setSize(280, 280);
/* 116:175 */     if (this.location == null)
/* 117:    */     {
/* 118:176 */       Dimension dim = getStartDimension(280, 280);
/* 119:177 */       setLocation(dim.width, dim.height);
/* 120:    */     }
/* 121:    */     else
/* 122:    */     {
/* 123:179 */       setLocation(this.location);
/* 124:    */     }
/* 125:181 */     setVisible(true);
/* 126:    */   }
/* 127:    */   
/* 128:    */   private void showNorthPanel(JPanel panel)
/* 129:    */   {
/* 130:190 */     this.button2 = new JButton("上一月");
/* 131:191 */     this.button2.setToolTipText("上一月");
/* 132:192 */     this.button2.addActionListener(this);
/* 133:193 */     panel.add(this.button2);
/* 134:194 */     this.comboBox1 = new JComboBox(this.years);
/* 135:195 */     this.comboBox1.setSelectedItem(String.valueOf(this.year1));
/* 136:196 */     this.comboBox1.setToolTipText("选择年份");
/* 137:197 */     this.comboBox1.addItemListener(this);
/* 138:198 */     panel.add(this.comboBox1);
/* 139:199 */     this.comboBox2 = new JComboBox(this.months);
/* 140:200 */     this.comboBox2.setSelectedItem(" " + formatDay(this.month1 + 1));
/* 141:201 */     this.comboBox2.setToolTipText("选择月份");
/* 142:202 */     this.comboBox2.addItemListener(this);
/* 143:203 */     panel.add(this.comboBox2);
/* 144:204 */     this.button3 = new JButton("下一月");
/* 145:205 */     this.button3.setToolTipText("下一月");
/* 146:206 */     this.button3.addActionListener(this);
/* 147:207 */     panel.add(this.button3);
/* 148:    */   }
/* 149:    */   
/* 150:    */   private void showSouthPanel(JPanel panel)
/* 151:    */   {
/* 152:217 */     panel.add(this.label1);
/* 153:218 */     this.button1 = new JButton("确定");
/* 154:219 */     this.button1.setToolTipText("确定");
/* 155:220 */     this.button1.addActionListener(this);
/* 156:221 */     panel.add(this.button1);
/* 157:222 */     panel.add(new JLabel(" "));
/* 158:    */   }
/* 159:    */   
/* 160:    */   public Calendar showCalendarDialog()
/* 161:    */   {
/* 162:232 */     showDialog();
/* 163:233 */     return this.calendar;
/* 164:    */   }
/* 165:    */   
/* 166:    */   private void setInfo(String info, Color c)
/* 167:    */   {
/* 168:242 */     if ((this.label1 != null) && (c != null))
/* 169:    */     {
/* 170:243 */       this.label1.setText(info);
/* 171:244 */       this.label1.setForeground(c);
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   private String formatDay(int day)
/* 176:    */   {
/* 177:255 */     if (day < 10) {
/* 178:256 */       return "0" + day;
/* 179:    */     }
/* 180:258 */     return String.valueOf(day);
/* 181:    */   }
/* 182:    */   
/* 183:    */   private JPanel printCalendar()
/* 184:    */   {
/* 185:268 */     this.panel = new JPanel();
/* 186:269 */     this.panel.setLayout(new GridLayout(7, 7, 0, 0));
/* 187:270 */     this.panel.setBorder(BorderFactory.createRaisedBevelBorder());
/* 188:271 */     int year2 = this.calendar.get(1);
/* 189:272 */     int month2 = this.calendar.get(2);
/* 190:    */     
/* 191:274 */     this.calendar.set(5, 1);
/* 192:    */     
/* 193:276 */     int weekDay = this.calendar.get(7);
/* 194:    */     
/* 195:278 */     JButton b = null;
/* 196:279 */     for (int i = 0; i < this.tits.length; i++)
/* 197:    */     {
/* 198:280 */       b = new JButton("<html><b>" + this.tits[i] + "</b></html>");
/* 199:281 */       b.setForeground(Color.BLACK);
/* 200:282 */       b.setBackground(Color.WHITE);
/* 201:283 */       b.setBorder(BorderFactory.createEmptyBorder());
/* 202:284 */       b.setEnabled(false);
/* 203:285 */       this.panel.add(b);
/* 204:    */     }
/* 205:287 */     int count = 0;
/* 206:288 */     for (int i = 1; i < weekDay; i++)
/* 207:    */     {
/* 208:289 */       b = new JButton(" ");
/* 209:290 */       b.setEnabled(false);
/* 210:291 */       this.panel.add(b);
/* 211:292 */       count++;
/* 212:    */     }
/* 213:294 */     int currday = 0;
/* 214:295 */     String dayStr = null;
/* 215:    */     do
/* 216:    */     {
/* 217:297 */       currday = this.calendar.get(5);
/* 218:298 */       dayStr = formatDay(currday);
/* 219:300 */       if ((currday == this.day1) && (this.month1 == month2) && (this.year1 == year2))
/* 220:    */       {
/* 221:301 */         b = new JButton("[" + dayStr + "]");
/* 222:302 */         b.setForeground(Color.RED);
/* 223:    */       }
/* 224:    */       else
/* 225:    */       {
/* 226:304 */         b = new JButton(dayStr);
/* 227:305 */         b.setForeground(Color.BLUE);
/* 228:    */       }
/* 229:307 */       count++;
/* 230:308 */       b
/* 231:309 */         .setToolTipText(year2 + "-" + formatDay(month2 + 1) + "-" + 
/* 232:310 */         dayStr);
/* 233:311 */       b.setBorder(BorderFactory.createEtchedBorder());
/* 234:312 */       b.addActionListener(this);
/* 235:313 */       b.addMouseListener(this.mdcEvent);
/* 236:314 */       this.panel.add(b);
/* 237:315 */       this.calendar.add(5, 1);
/* 238:317 */     } while (this.calendar.get(2) == month2);
/* 239:319 */     this.calendar.add(2, -1);
/* 240:320 */     for (int i = count; i < 42; i++)
/* 241:    */     {
/* 242:321 */       b = new JButton(" ");
/* 243:322 */       b.setEnabled(false);
/* 244:323 */       this.panel.add(b);
/* 245:    */     }
/* 246:325 */     return this.panel;
/* 247:    */   }
/* 248:    */   
/* 249:    */   private class MouseDoubleClickedEvent
/* 250:    */     extends MouseAdapter
/* 251:    */   {
/* 252:    */     private MouseDoubleClickedEvent() {}
/* 253:    */     
/* 254:    */     public void mouseClicked(MouseEvent e)
/* 255:    */     {
/* 256:334 */       if ((1 == e.getButton()) && 
/* 257:335 */         (e.getClickCount() == 2))
/* 258:    */       {
/* 259:337 */         JButton b = (JButton)e.getSource();
/* 260:338 */         String s = b.getText();
/* 261:339 */         if (s.matches("^\\d+$"))
/* 262:    */         {
/* 263:340 */           int day = Integer.parseInt(s);
/* 264:341 */           JCalendarChooser.this.calendar.set(5, day);
/* 265:    */         }
/* 266:342 */         else if (s.startsWith("["))
/* 267:    */         {
/* 268:343 */           JCalendarChooser.this.calendar.set(5, JCalendarChooser.this.day1);
/* 269:    */         }                    
                      datePicker.setText( DateUtils.date2Str(JCalendarChooser.this.calendar.getTime()));
                      
/* 270:346 */         JCalendarChooser.this.chooser.dispose();
                  
/* 271:    */       }
/* 272:    */     }
/* 273:    */   }
/* 274:    */   
/* 275:    */   private void updatePanel()
/* 276:    */   {
/* 277:357 */     remove(this.panel);
/* 278:358 */     add(printCalendar(), "Center");
/* 279:359 */     validate();
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void actionPerformed(ActionEvent e)
/* 283:    */   {
/* 284:368 */     String command = e.getActionCommand();
/* 285:369 */     if ("下一月".equals(command))
/* 286:    */     {
/* 287:371 */       this.calendar.add(2, 1);
/* 288:    */       
/* 289:373 */       int year5 = this.calendar.get(1);
/* 290:    */       
/* 291:375 */       int maxYear = this.year1 + 49;
/* 292:376 */       if (year5 > maxYear)
/* 293:    */       {
/* 294:377 */         this.calendar.add(2, -1);
/* 295:378 */         setInfo("年份越界: [" + year5 + " > " + maxYear + "]      ", 
/* 296:379 */           Color.RED);
/* 297:380 */         return;
/* 298:    */       }
/* 299:382 */       int month5 = this.calendar.get(2) + 1;
/* 300:383 */       this.comboBox1.setSelectedItem(String.valueOf(year5));
/* 301:384 */       this.comboBox2.setSelectedItem(" " + formatDay(month5));
/* 302:    */       
/* 303:386 */       updatePanel();
/* 304:    */     }
/* 305:387 */     else if ("上一月".equals(command))
/* 306:    */     {
/* 307:389 */       this.calendar.add(2, -1);
/* 308:    */       
/* 309:391 */       int year5 = this.calendar.get(1);
/* 310:    */       
/* 311:393 */       int minYear = this.year1 - 50;
/* 312:394 */       if (year5 < minYear)
/* 313:    */       {
/* 314:395 */         this.calendar.add(2, 1);
/* 315:396 */         setInfo("年份越界: [" + year5 + " < " + minYear + "]      ", 
/* 316:397 */           Color.RED);
/* 317:398 */         return;
/* 318:    */       }
/* 319:400 */       int month5 = this.calendar.get(2) + 1;
/* 320:401 */       this.comboBox1.setSelectedItem(String.valueOf(year5));
/* 321:402 */       this.comboBox2.setSelectedItem(" " + formatDay(month5));
/* 322:    */       
/* 323:404 */       updatePanel();
/* 324:    */     }
/* 325:405 */     else if ("确定".equals(command))
/* 326:    */     {
                    datePicker.setText( DateUtils.date2Str(JCalendarChooser.this.calendar.getTime()));
/* 327:406 */       this.chooser.dispose();
/* 328:    */     }
/* 329:407 */     else if (command.matches("^\\d+$"))
/* 330:    */     {
/* 331:409 */       int day9 = Integer.parseInt(command);
/* 332:410 */       this.calendar.set(5, day9);
/* 333:411 */       String str = this.calendar.get(1) + "-" + 
/* 334:412 */         formatDay(this.calendar.get(2) + 1) + 
/* 335:413 */         "-" + 
/* 336:414 */         formatDay(this.calendar.get(5));
/* 337:415 */       setInfo("你选择日期: " + str + "           ", getRandomColor());
/* 338:    */     }
/* 339:416 */     else if (command.startsWith("["))
/* 340:    */     {
/* 341:418 */       this.calendar.set(5, this.day1);
/* 342:419 */       String str = this.calendar.get(1) + "-" + 
/* 343:420 */         formatDay(this.calendar.get(2) + 1) + 
/* 344:421 */         "-" + 
/* 345:422 */         formatDay(this.calendar.get(5));
/* 346:423 */       setInfo("你选择日期: " + str + "           ", getRandomColor());
/* 347:    */     }
/* 348:    */   }
/* 349:    */   
/* 350:    */   private Color getRandomColor()
/* 351:    */   {
/* 352:433 */     Random random = new Random();
/* 353:434 */     Color c = new Color(random.nextInt(255), random.nextInt(255), random
/* 354:435 */       .nextInt(255));
/* 355:436 */     return c;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public void itemStateChanged(ItemEvent e)
/* 359:    */   {
/* 360:445 */     int type = 0;
/* 361:446 */     String s = e.getItemSelectable().getSelectedObjects()[0].toString()
/* 362:447 */       .trim();
/* 363:448 */     if (s.length() == 2) {
/* 364:449 */       type = 1;
/* 365:    */     }
/* 366:451 */     int value = Integer.parseInt(s);
/* 367:452 */     if (this.tempValue == 0)
/* 368:    */     {
/* 369:453 */       this.tempValue = value;
/* 370:454 */       processStateChanged(value, type);
/* 371:    */     }
/* 372:456 */     else if (value != this.tempValue)
/* 373:    */     {
/* 374:457 */       processStateChanged(value, type);
/* 375:458 */       this.tempValue = value;
/* 376:    */     }
/* 377:    */   }
/* 378:    */   
/* 379:    */   private void processStateChanged(int value, int type)
/* 380:    */   {
/* 381:471 */     if (type == 0) {
/* 382:472 */       this.calendar.set(1, value);
/* 383:473 */     } else if (1 == type) {
/* 384:474 */       this.calendar.set(2, value - 1);
/* 385:    */     }
/* 386:477 */     updatePanel();
/* 387:    */   }
/* 388:    */   
/* 389:481 */   private int tempValue = 0;
/* 390:    */   private static final int DEFAULT_WIDTH = 280;
/* 391:    */   private static final int DEFAULT_HEIGHT = 280;
/* 392:    */   private static final int DEFAULT_SHOW_YEARS = 100;
/* 393:489 */   private JLabel label1 = null;
/* 394:490 */   private JButton button1 = null;
/* 395:492 */   private JButton button2 = null;
/* 396:493 */   private JButton button3 = null;
/* 397:495 */   private JComboBox comboBox1 = null;
/* 398:496 */   private JComboBox comboBox2 = null;
/* 399:498 */   private Calendar calendar = null;
/* 400:500 */   private String[] years = null;
/* 401:501 */   private String[] months = null;
/* 402:    */   private int year1;
/* 403:    */   private int month1;
/* 404:    */   private int day1;
/* 405:504 */   private JPanel panel = null;
/* 406:505 */   private String[] tits = { "日", "一", "二", "三", "四", "五", "六" };
/* 407:506 */   private String title = "选择日期";
/* 408:507 */   private Point location = null;
/* 409:508 */   private MouseDoubleClickedEvent mdcEvent = null;
/* 410:509 */   private JCalendarChooser chooser = null;
/* 411:    */ }



/* Location:           C:\Users\Administrator\Desktop\calendar.jar

 * Qualified Name:     com.mkk.swing.JCalendarChooser

 * JD-Core Version:    0.7.0.1

 */