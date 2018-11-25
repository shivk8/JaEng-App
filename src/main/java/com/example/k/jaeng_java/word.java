package com.example.k.jaeng_fragments;


    public class word {
        private String japTranslation;
        private String defTranslation;
        private int resourceId;
        private int NO_IMAGE_PROVIDED= -1;

        public word(String jTranslation,String defaultTranslation)
        {
            japTranslation = jTranslation;
            defTranslation = defaultTranslation;
        }

        public word(String jTranslation,String defaultTranslation,int resId)
        {
            japTranslation = jTranslation;
            defTranslation = defaultTranslation;
            resourceId = resId;
        }

        public String getJapTranslation()
        {
            return japTranslation;
        }

        public String getDefTranslation() {
            return defTranslation;
        }

        public int getResourceId()
        {
            return resourceId;
        }

        public boolean noImage()
        {
            return resourceId!=NO_IMAGE_PROVIDED;
        }
    }


