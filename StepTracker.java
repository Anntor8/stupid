
        public class StepTracker {
            int[] stepData = new int[30];
            int[] monthData = new int[12];
            int[] monthStep = new int[30];

            public StepTracker() {

                for (int i = 0; i < monthData.length; i++) {
                    monthData[i] = new MonthData();
                }
            }

            class MonthData // MonthData[] хранит связь месяц - данные, а именно: суммарное количество шагов за месяц, максимальное количество шагов за месяц, продолжительно лучшей серии.
            {
                int saveSteps(int month, int day, int step) {
                stepDay[data] = step;
                    // данные хранятся в классе MonthData, то есть массив int[] хранит связь день - шаги за день. И этот класс содержит в себе методы, которые помогают получить вышеперечисленные данные
                }
            }
        }
    }

