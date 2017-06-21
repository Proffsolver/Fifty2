package com.solga.fifty2.data.storage.models;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "GOALS")
public class Goals {

    @Id
    private Long id;

    @NotNull
    @Unique
    private String RemoteId;

    private String goalsRemoteId;



    @NotNull
    @Unique
    private String goalName;

    private String goalCreator;

    private int limitGoal;

    private long waysId;

    @ToOne(joinProperty = "waysId")
    private Ways mWays;

    private long calId;

    @ToOne(joinProperty = "calId")
    private Calendars mCalendars;

    @ToMany(joinProperties = {@JoinProperty(name = "RemoteId" , referencedName = "goalRemoteId")})
    private List<Tasks> mTasks;

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

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 2136390253)
    public synchronized void resetMTasks() {
        mTasks = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 400600515)
    public List<Tasks> getMTasks() {
        if (mTasks == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TasksDao targetDao = daoSession.getTasksDao();
            List<Tasks> mTasksNew = targetDao._queryGoals_MTasks(RemoteId);
            synchronized (this) {
                if(mTasks == null) {
                    mTasks = mTasksNew;
                }
            }
        }
        return mTasks;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 341014755)
    public void setMWays(@NotNull Ways mWays) {
        if (mWays == null) {
            throw new DaoException(
                    "To-one property 'waysId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.mWays = mWays;
            waysId = mWays.getId();
            mWays__resolvedKey = waysId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1521367070)
    public Ways getMWays() {
        long __key = this.waysId;
        if (mWays__resolvedKey == null || !mWays__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            WaysDao targetDao = daoSession.getWaysDao();
            Ways mWaysNew = targetDao.load(__key);
            synchronized (this) {
                mWays = mWaysNew;
                mWays__resolvedKey = __key;
            }
        }
        return mWays;
    }

    @Generated(hash = 581836054)
    private transient Long mWays__resolvedKey;

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 663126040)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGoalsDao() : null;
    }

    /** Used for active entity operations. */
    @Generated(hash = 1140135126)
    private transient GoalsDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    @Generated(hash = 719694795)
    private transient Long mCalendars__resolvedKey;

    public long getWaysId() {
        return this.waysId;
    }

    public void setWaysId(long waysId) {
        this.waysId = waysId;
    }

    public int getLimitGoal() {
        return this.limitGoal;
    }

    public void setLimitGoal(int limitGoal) {
        this.limitGoal = limitGoal;
    }

    public String getGoalCreator() {
        return this.goalCreator;
    }

    public void setGoalCreator(String goalCreator) {
        this.goalCreator = goalCreator;
    }

    public String getGoalName() {
        return this.goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalsRemoteId() {
        return this.goalsRemoteId;
    }

    public void setGoalsRemoteId(String goalsRemoteId) {
        this.goalsRemoteId = goalsRemoteId;
    }

    public String getRemoteId() {
        return this.RemoteId;
    }

    public void setRemoteId(String RemoteId) {
        this.RemoteId = RemoteId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1120550897)
    public void setMCalendars(@NotNull Calendars mCalendars) {
        if (mCalendars == null) {
            throw new DaoException(
                    "To-one property 'calId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.mCalendars = mCalendars;
            calId = mCalendars.getId();
            mCalendars__resolvedKey = calId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 248670156)
    public Calendars getMCalendars() {
        long __key = this.calId;
        if (mCalendars__resolvedKey == null || !mCalendars__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CalendarsDao targetDao = daoSession.getCalendarsDao();
            Calendars mCalendarsNew = targetDao.load(__key);
            synchronized (this) {
                mCalendars = mCalendarsNew;
                mCalendars__resolvedKey = __key;
            }
        }
        return mCalendars;
    }

    public long getCalId() {
        return this.calId;
    }

    public void setCalId(long calId) {
        this.calId = calId;
    }

    @Generated(hash = 1520833565)
    public Goals(Long id, @NotNull String RemoteId, String goalsRemoteId, @NotNull String goalName,
            String goalCreator, int limitGoal, long waysId, long calId) {
        this.id = id;
        this.RemoteId = RemoteId;
        this.goalsRemoteId = goalsRemoteId;
        this.goalName = goalName;
        this.goalCreator = goalCreator;
        this.limitGoal = limitGoal;
        this.waysId = waysId;
        this.calId = calId;
    }

    @Generated(hash = 1560055200)
    public Goals() {
    }


}
