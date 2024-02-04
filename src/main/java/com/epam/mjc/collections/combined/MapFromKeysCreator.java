package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();

        sourceMap.keySet().forEach(k ->
                res.put(k.length(),
                        sourceMap.keySet().stream()
                                .filter(v -> v.length() == k.length())
                                .collect(Collectors.toSet()))
        );

        return res;
    }
}
