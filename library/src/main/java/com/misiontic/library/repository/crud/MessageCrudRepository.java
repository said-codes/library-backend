package com.misiontic.library.repository.crud;

import com.misiontic.library.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
