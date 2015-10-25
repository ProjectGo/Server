package server.service;

import server.model.Group;

import java.util.List;


public interface GroupService {

    void saveGroup(Group Group);

    List<Group> findAllGroups();



}