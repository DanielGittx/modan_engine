package com.engine.modanengine.dao;

import java.util.List;
import com.engine.modanengine.model.DataPointsModel;
import javax.sql.DataSource;

public interface DataPointsDAO 
{
    public List<DataPointsModel> getDataPoints();
    public void setDataSource(DataSource ds);
}