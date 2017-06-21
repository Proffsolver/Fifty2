package com.solga.fifty2.data.storage.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(active = true, nameInDb = "WAYS")
public class Ways {

    @Id
    private Long id;

    @NotNull
    @Unique
    private String RemoteId;


    private String wayRemoteId;

    @NotNull
    @Unique
    private String wayName;

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
    @Generated(hash = 1301703503)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getWaysDao() : null;
    }

    /** Used for active entity operations. */
    @Generated(hash = 1527514403)
    private transient WaysDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public String getWayName() {
        return this.wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName;
    }

    public String getWayRemoteId() {
        return this.wayRemoteId;
    }

    public void setWayRemoteId(String wayRemoteId) {
        this.wayRemoteId = wayRemoteId;
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

    @Generated(hash = 1146706067)
    public Ways(Long id, @NotNull String RemoteId, String wayRemoteId,
            @NotNull String wayName) {
        this.id = id;
        this.RemoteId = RemoteId;
        this.wayRemoteId = wayRemoteId;
        this.wayName = wayName;
    }

    @Generated(hash = 557765576)
    public Ways() {
    }


}
