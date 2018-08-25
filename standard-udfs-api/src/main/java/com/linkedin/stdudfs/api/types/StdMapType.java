package com.linkedin.stdudfs.api.types;

/** A {@link StdType} representing a map type. */
public interface StdMapType extends StdType {

  /** Returns the {@link StdType} of the map keys. */
  StdType keyType();

  /** Returns the {@link StdType} of the map values. */
  StdType valueType();
}