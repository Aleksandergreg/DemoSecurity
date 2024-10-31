package org.poll.jwtsecurity.service;


import org.poll.jwtsecurity.model.User;

import java.util.List;

public interface IUserService extends ICrudService<User,Long>{
    List<User> findByName(String name);
}
