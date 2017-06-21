package com.solga.fifty2.data.storage.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "USERS")
public class Users {

    @Id
    private Long id;

    @NotNull
    @Unique
    private String RemoteId;

    @NotNull
    @Unique
    private String mEmail;

    private String mNickname;

    private String mName;
    private String mSurName;


    @ToMany(joinProperties = {@JoinProperty(name = "RemoteId" , referencedName = "goalsRemoteId")})
    private List<Goals> mGoals;


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
    @Generated(hash = 693698830)
    public synchronized void resetMGoals() {
        mGoals = null;
    }


    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 24757263)
    public List<Goals> getMGoals() {
        if (mGoals == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GoalsDao targetDao = daoSession.getGoalsDao();
            List<Goals> mGoalsNew = targetDao._queryUsers_MGoals(RemoteId);
            synchronized (this) {
                if(mGoals == null) {
                    mGoals = mGoalsNew;
                }
            }
        }
        return mGoals;
    }


    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1562339706)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUsersDao() : null;
    }


    /** Used for active entity operations. */
    @Generated(hash = 1073488616)
    private transient UsersDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;


    public String getMSurName() {
        return this.mSurName;
    }


    public void setMSurName(String mSurName) {
        this.mSurName = mSurName;
    }


    public String getMName() {
        return this.mName;
    }


    public void setMName(String mName) {
        this.mName = mName;
    }


    public String getMNickname() {
        return this.mNickname;
    }


    public void setMNickname(String mNickname) {
        this.mNickname = mNickname;
    }


    public String getMEmail() {
        return this.mEmail;
    }


    public void setMEmail(String mEmail) {
        this.mEmail = mEmail;
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


    @Generated(hash = 178027986)
    public Users(Long id, @NotNull String RemoteId, @NotNull String mEmail, String mNickname,
            String mName, String mSurName) {
        this.id = id;
        this.RemoteId = RemoteId;
        this.mEmail = mEmail;
        this.mNickname = mNickname;
        this.mName = mName;
        this.mSurName = mSurName;
    }


    @Generated(hash = 2146996206)
    public Users() {
    }
}
