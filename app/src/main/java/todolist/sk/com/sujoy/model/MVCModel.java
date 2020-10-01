package todolist.sk.com.sujoy.model;

import java.util.List;

import todolist.sk.com.sujoy.model.bean.ToDo;

public interface MVCModel {

    public List<ToDo> getAllToDos() throws Exception;
    public boolean addToDoItem(String toDoItem, String place) throws Exception;
    public boolean removeToDoItem(int id) throws Exception;
    public boolean modifyToDoItem(int id, String newToDoValuel) throws Exception;
}
