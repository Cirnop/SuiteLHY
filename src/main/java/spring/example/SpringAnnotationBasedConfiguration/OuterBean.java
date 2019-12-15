package spring.example.SpringAnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class OuterBean {

    private InnerBean innerBean;

    private OuterBean() {
        System.out.println("Inside OuterBean constructor.");
    }

    public void showInnerBean() {
        System.out.println("showInnerBean():");
        innerBean.show();
    }

    //===== getter and setter =====//
    public InnerBean getInnerBean() {
        return innerBean;
    }

    @Autowired
    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }

}
