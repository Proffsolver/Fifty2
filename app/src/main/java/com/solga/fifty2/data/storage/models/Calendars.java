package com.solga.fifty2.data.storage.models;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "CALENDARS")
public class Calendars {

    @Id
    private Long id;

    @NotNull
    @Unique
    private String RemoteId;

    private String calRemoteId;

    private String mCal;

    private Boolean bTypeCal;

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
    @Generated(hash = 751843488)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCalendarsDao() : null;
    }

    /** Used for active entity operations. */
    @Generated(hash = 436144409)
    private transient CalendarsDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public Boolean getBTypeCal() {
        return this.bTypeCal;
    }

    public void setBTypeCal(Boolean bTypeCal) {
        this.bTypeCal = bTypeCal;
    }

    public String getMCal() {
        return this.mCal;
    }

    public void setMCal(String mCal) {
        this.mCal = mCal;
    }

    public String getCalRemoteId() {
        return this.calRemoteId;
    }

    public void setCalRemoteId(String calRemoteId) {
        this.calRemoteId = calRemoteId;
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

    @Generated(hash = 340618123)
    public Calendars(Long id, @NotNull String RemoteId, String calRemoteId,
            String mCal, Boolean bTypeCal) {
        this.id = id;
        this.RemoteId = RemoteId;
        this.calRemoteId = calRemoteId;
        this.mCal = mCal;
        this.bTypeCal = bTypeCal;
    }

    @Generated(hash = 2115751009)
    public Calendars() {
    }

}
