package cn.chestnut.mvvm.teamworker.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.chestnut.mvvm.teamworker.model.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property Token = new Property(2, String.class, "token", false, "TOKEN");
        public final static Property Nickname = new Property(3, String.class, "nickname", false, "NICKNAME");
        public final static Property Avatar = new Property(4, String.class, "avatar", false, "AVATAR");
        public final static Property Telephone = new Property(5, String.class, "telephone", false, "TELEPHONE");
        public final static Property Sex = new Property(6, String.class, "sex", false, "SEX");
        public final static Property Birthday = new Property(7, String.class, "birthday", false, "BIRTHDAY");
        public final static Property Region = new Property(8, String.class, "region", false, "REGION");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_ID\" TEXT UNIQUE ," + // 1: userId
                "\"TOKEN\" TEXT," + // 2: token
                "\"NICKNAME\" TEXT," + // 3: nickname
                "\"AVATAR\" TEXT," + // 4: avatar
                "\"TELEPHONE\" TEXT," + // 5: telephone
                "\"SEX\" TEXT," + // 6: sex
                "\"BIRTHDAY\" TEXT," + // 7: birthday
                "\"REGION\" TEXT);"); // 8: region
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(4, nickname);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(6, telephone);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(7, sex);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(8, birthday);
        }
 
        String region = entity.getRegion();
        if (region != null) {
            stmt.bindString(9, region);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(3, token);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(4, nickname);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(6, telephone);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(7, sex);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(8, birthday);
        }
 
        String region = entity.getRegion();
        if (region != null) {
            stmt.bindString(9, region);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // token
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nickname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // avatar
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // telephone
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sex
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // birthday
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // region
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setToken(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNickname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTelephone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSex(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBirthday(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRegion(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}