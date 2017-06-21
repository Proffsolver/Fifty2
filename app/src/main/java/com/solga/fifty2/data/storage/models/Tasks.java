package com.solga.fifty2.data.storage.models;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "TASKS")
public class Tasks {


    @Id
    private Long id;

    private String goalRemoteId;

    @NotNull
    @Unique
    private String tasklName;

    private int limitTask;

    private Long taskKPI;

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1971834035)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTasksDao() : null;
    }

    /** Used for active entity operations. */
    @Generated(hash = 2091252684)
    private transient TasksDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public Long getTaskKPI() {
        return this.taskKPI;
    }

    public void setTaskKPI(Long taskKPI) {
        this.taskKPI = taskKPI;
    }

    public int getLimitTask() {
        return this.limitTask;
    }

    public void setLimitTask(int limitTask) {
        this.limitTask = limitTask;
    }

    public String getTasklName() {
        return this.tasklName;
    }

    public void setTasklName(String tasklName) {
        this.tasklName = tasklName;
    }

    public String getGoalRemoteId() {
        return this.goalRemoteId;
    }

    public void setGoalRemoteId(String goalRemoteId) {
        this.goalRemoteId = goalRemoteId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 227884604)
    public Tasks(Long id, String goalRemoteId, @NotNull String tasklName,
            int limitTask, Long taskKPI) {
        this.id = id;
        this.goalRemoteId = goalRemoteId;
        this.tasklName = tasklName;
        this.limitTask = limitTask;
        this.taskKPI = taskKPI;
    }

    @Generated(hash = 1908996543)
    public Tasks() {
    }


}
