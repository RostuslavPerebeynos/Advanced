package ua.com.library.validator;

import ua.com.library.entity.Book;
import ua.com.library.entity.Role;

public interface UserValidationMessages {

    String EMPTY_USERNAME_FIELD = "EMPTY_USERNAME_FIELD";
    String EMPTY_PASSWORD_FIELD = "EMPTY_PASSWORD_FIELD";
    String EMPTY_EMAIl_FIELD = "EMPTY_EMAIL_FIELD";
    String EMPTY_PHONE_FIELD = "EMPTY_PHONE_FIELD";
    String NAME_ALREADY_EXIST = "NAME_ALREADY_EXIST";
    String EMAIL_ALREADY_EXIST = "EMAIL_ALREADY_EXIST";
    String PHONE_ALREADY_EXIST = "PHONE_ALREADY_EXIST";


}