package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> res = new HashSet<>();

        timetable.values().forEach(res::addAll);
        res.forEach(System.out::println);

        return res;
    }
}
