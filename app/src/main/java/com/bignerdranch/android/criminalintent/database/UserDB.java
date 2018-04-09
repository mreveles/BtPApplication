package com.bignerdranch.android.criminalintent.database;

public class UserDB {
        public static final class CrimeTable {

            public static final String NAME = "crimes";

            public static final class Cols {
                public static final String UserID = "uuid";
                public static final String UserFName = "UserFName";
                public static final String UserLName = "UserLname";
                public static final String UserAddress = "UserAddress";
                public static final String UserEmail = "UserEmail";
                public static final String UserSSN = "UserSSN";
                public static final String UserBDay = "UserBDay";
                public static final String UserPassowrd="UserPassword";

            }
        }
    }