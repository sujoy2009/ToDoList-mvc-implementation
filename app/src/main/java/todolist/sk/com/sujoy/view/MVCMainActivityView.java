package todolist.sk.com.sujoy.view;

import java.util.List;

import todolist.sk.com.sujoy.model.bean.ToDo;

public interface MVCMainActivityView extends MVCView{

    public void bindDataToView();

    public void showAllToDos(List<ToDo> toDoList);
    public void updateViewonAdd(List<ToDo> toDoList);
    public void upDateViewOnRemove(List<ToDo> toDoList);
    public void updateViewOnModify(List<ToDo> toDoList);

    public void showErrorToast(String errorMessage);
}
