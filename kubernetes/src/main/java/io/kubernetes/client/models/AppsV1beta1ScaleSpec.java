/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScaleSpec describes the attributes of a scale subresource
 */
@ApiModel(description = "ScaleSpec describes the attributes of a scale subresource")

public class AppsV1beta1ScaleSpec {
  @SerializedName("replicas")
  private Integer replicas = null;

  public AppsV1beta1ScaleSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * desired number of instances for the scaled object.
   * @return replicas
  **/
  @ApiModelProperty(value = "desired number of instances for the scaled object.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsV1beta1ScaleSpec appsV1beta1ScaleSpec = (AppsV1beta1ScaleSpec) o;
    return Objects.equals(this.replicas, appsV1beta1ScaleSpec.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1ScaleSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
