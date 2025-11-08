package com.cetin.custom.qualifier;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A generic Spring-managed utility component for building maps.
 * @param <K> the type of the keys produced for the resulting map
 * @param <V> the type of the values contained in the source collection
 */
@Component
public class MapBuilder<K, V> {

  /**
   * Builds a map from the given collection by extracting keys from each element.
   *
   * @param source     the collection of values to convert; must not be {@code null}
   * @param keyMapper  a function that extracts a key from a value; must not be {@code null}
   * @return a map where each value is indexed by the key produced by {@code keyMapper}
   * @throws IllegalArgumentException if two or more elements produce the same key
   */
  public Map<K, V> toMap(Collection<V> source, Function<V, K> keyMapper) {
    Objects.requireNonNull(source, "source is null");
    Objects.requireNonNull(keyMapper, "keyMapper is null");
    return source.stream().collect(
        Collectors.toMap(
            keyMapper,
            Function.identity(),
            (a, b) -> {
              throw new IllegalArgumentException("Duplicate key: " + keyMapper.apply(a));
            }
        )
    );
  }
}