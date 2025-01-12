package ru.firstset.whereisuser.data.location;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {LocationUser.class}, version = 3)
public abstract class LocationDatabase extends RoomDatabase {
    public abstract LocationDAO getLocationDao();

}