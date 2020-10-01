package todolist.sk.com.sujoy;

import android.app.Application;

import todolist.sk.com.sujoy.model.db.ToDoListDBAdapter;

public class MyApplication extends Application {

    static ToDoListDBAdapter toDoListDBAdapter;

    @Override
    public void onCreate() {
        super.onCreate();
        toDoListDBAdapter = ToDoListDBAdapter.getToDoListDBAdapterInstance(this);
    }

    public static ToDoListDBAdapter getToDoListDBAdapter() {
        return toDoListDBAdapter;
    }
}
