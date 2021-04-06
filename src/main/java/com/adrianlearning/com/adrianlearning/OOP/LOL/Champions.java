package com.adrianlearning.com.adrianlearning.OOP.LOL;

public enum Champions {
        SORAKA (5000, 300),
        GAREN (450, 200);

        private Integer championValue;
        private Integer skinValue;

        Champions(Integer championValue, Integer skinValue) {
            this.championValue = championValue;
            this.skinValue = skinValue;
        }

        public Integer getChampionValue() {
            return championValue;
        }

        public Integer getSkinValue() {
            return skinValue;
        }
    }

