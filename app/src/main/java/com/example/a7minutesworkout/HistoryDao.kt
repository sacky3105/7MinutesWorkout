package com.example.a7minutesworkout

import androidx.room.*

@Dao
interface HistoryDao {
    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    @Query("SELECT * FROM `history-table`")
    fun fetchAllDates(): kotlinx.coroutines.flow.Flow<List<HistoryEntity>>
}