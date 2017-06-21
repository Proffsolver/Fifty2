package com.solga.fifty2.data.network.res;

import java.util.List;

public class GetTasksRes {


    private List<Task> tasks = null;

    public List<Task> getTasks() {
        return tasks;
    }

    public class Task {

        private int idTask;
        private String descTask;
        private String durationTask;
        private String kpiTask;
        private String periodTask;


        public int getIdTask() {
            return idTask;
        }

        public String getDescTask() {
            return descTask;
        }

        public String getDurationTask() {
            return durationTask;
        }

        public String getKpiTask() {
            return kpiTask;
        }

        public String getPeriodTask() {
            return periodTask;
        }
    }
}
