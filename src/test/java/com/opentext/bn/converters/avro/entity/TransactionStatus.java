/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.opentext.bn.converters.avro.entity;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum TransactionStatus {
  PROCESSING, DELIVERY_IN_PROGRESS, DELIVERY_DISABLED, READY_FOR_PICKUP, BATCHED, DELIVERED, ON_HOLD, DUPLICATED, RECEIVER_ERROR, DELIVERY_ERROR, VALIDATION_ERROR, FAILED, COMPLETED, TERMINATED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"TransactionStatus\",\"namespace\":\"com.opentext.bn.converters.avro.entity\",\"symbols\":[\"PROCESSING\",\"DELIVERY_IN_PROGRESS\",\"DELIVERY_DISABLED\",\"READY_FOR_PICKUP\",\"BATCHED\",\"DELIVERED\",\"ON_HOLD\",\"DUPLICATED\",\"RECEIVER_ERROR\",\"DELIVERY_ERROR\",\"VALIDATION_ERROR\",\"FAILED\",\"COMPLETED\",\"TERMINATED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
