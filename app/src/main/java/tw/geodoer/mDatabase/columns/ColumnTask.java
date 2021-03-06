package tw.geodoer.mDatabase.columns;

import android.net.Uri;
import android.provider.BaseColumns;

import tw.geodoer.utils.CommonVar;

/**
 * @author Kent
 * @version 20141224
 * @category database
 */
public final class ColumnTask implements BaseColumns {

    // 預設排序常數
    public static final String DEFAULT_SORT_ORDER = "created DESC";
    //
    public static final int TASK_STATUS_NORMAL = 0;
    public static final int TASK_STATUS_FINISHED = 1;
    public static final int TASK_STATUS_TRASHED = 2;
    // 資料表名稱常數
    public static final String TABLE_NAME = "tasks";
    // 存取Uri
    public static final Uri URI =
            Uri.parse("content://" + CommonVar.AUTHORITY + "/" + TABLE_NAME);
    public static final String exec_SQL_Statment =
            "CREATE TABLE "
                    + TABLE_NAME
                    + " ("
                    // Task ID
                    + KEY._id + " INTEGER PRIMARY KEY autoincrement,"
                    //主要內容
                    + KEY.title + " TEXT,"
                    + KEY.status + " TEXT,"
                    + KEY.content + " TEXT,"
                    + KEY.due_date_millis + " LONG,"
                    + KEY.due_date_string + " TEXT,"
                    + KEY.color + " INTEGER,"
                    + KEY.priority + " LONG,"
                    + KEY.created + " LONG,"
                    //分類 + " TEXT,"標籤與優先
                    + KEY.category_id + " INTEGER,"
                    + KEY.tag_id + " INTEGER,"
                    + KEY.project_id + " INTEGER,"
                    + KEY.collaborator_id + " INTEGER,"
                    + KEY.sync_id + " INTEGER,"
                    + KEY.location_id + " INTEGER,"
                    // 已完成
                    + KEY.checked + " INTEGER,"
                    + " created_at DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ");";
    // 查詢欄位陣列
    public static final String[] PROJECTION = new String[]{
            KEY._id,
            //主要內容
            KEY.title,
            KEY.status,
            KEY.content,
            KEY.due_date_millis,
            KEY.due_date_string,
            KEY.color,
            KEY.priority,
            KEY.created,
            //分類,標籤與優先
            KEY.category_id,
            KEY.tag_id,
            KEY.project_id,
            KEY.collaborator_id,
            KEY.sync_id,
            KEY.location_id,
            // 已完成
            KEY.checked
    };


    private ColumnTask() {
    }

    /*
     *  ColumnNames - 欄位名稱
     */
    public static class KEY {

        // index
        public static final String _id = "_id";
        // 主要內容
        public static final String title = "title";
        public static final String status = "status";
        public static final String content = "content";
        public static final String due_date_millis = "due_date_millis";
        public static final String due_date_string = "due_date_string";
        public static final String color = "color";
        public static final String priority = "priority";
        public static final String created = "created";
        // 分類,標籤與優先
        public static final String category_id = "category_id";
        public static final String tag_id = "tag_id";
        public static final String project_id = "project_id";
        public static final String collaborator_id = "collaborator_id";
        public static final String sync_id = "sync_id";
        public static final String location_id = "location_id";
        // 已完成
        public static final String checked = "checked";


        /*
         *  欄位索引值
         */
        public static class INDEX {

            public static final int _id = 0;
            //主要內容
            public static final int title = 1;
            public static final int status = 2;
            public static final int content = 3;
            public static final int due_date_millis = 4;
            public static final int due_date_string = 5;
            public static final int color = 6;
            public static final int priority = 7;
            public static final int created = 8;
            //分類,標籤與優先
            public static final int category_id = 9;
            public static final int tag_id = 10;
            public static final int project_id = 11;
            public static final int collaborator_id = 12;
            public static final int sync_id = 13;
            public static final int location_id = 14;
            // 已完成
            public static final int checked = 15;
        }
    }

}
