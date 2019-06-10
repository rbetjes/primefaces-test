package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DualListModel;
import java.util.ArrayList;
import java.util.Collection;
import org.primefaces.event.SelectEvent;
import java.util.stream.Collectors;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    private DualListModel<TestPojo> pojoSelection;
    private Collection<TestPojo> pojoList;

    @PostConstruct
    public void init() {
        pojoList = new ArrayList<TestPojo>();
        pojoList.add(new TestPojo(1,"One"));
        pojoList.add(new TestPojo(2,"Two"));
        pojoSelection = new DualListModel<>(new ArrayList<TestPojo>(), new ArrayList<TestPojo>());
        this.pojoSelection.getSource().addAll(pojoList);
    }

    public void selectPojoListener(SelectEvent event) {
        System.out.println("got: " + event.getObject());
    }



    public DualListModel<TestPojo> getPojoSelection() {
        return pojoSelection;
    }

    public void setPojoSelection(DualListModel<TestPojo> pojoSelection) {
        this.pojoSelection = pojoSelection;
    }

    public Collection<TestPojo> getPojoList() {
        return pojoList;
    }

    public void setPojoList(Collection<TestPojo> pojoList) {
        this.pojoList = pojoList;
    }
}
