package QRCode.task.model;

public class BoxConnProd {
    private Integer id;

    private String boxcode;

    private String prodcode;

    private Integer taskid;

    private String batch;

    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoxcode() {
        return boxcode;
    }

    public void setBoxcode(String boxcode) {
        this.boxcode = boxcode == null ? null : boxcode.trim();
    }

    public String getProdcode() {
        return prodcode;
    }

    public void setProdcode(String prodcode) {
        this.prodcode = prodcode == null ? null : prodcode.trim();
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}