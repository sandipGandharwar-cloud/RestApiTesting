package pojo;

import java.util.List;

public class CodeClass {
    private int code;
    private MetaClass MetaClass;
    private List<Data> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public pojo.MetaClass getMetaClass() {
        return MetaClass;
    }

    public void setMetaClass(pojo.MetaClass metaClass) {
        MetaClass = metaClass;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
