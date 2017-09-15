package org.minlia.apps.sample.petstore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.minlia.cloud.entity.AbstractEntity;
import com.minlia.modules.rbac.domain.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by will on 8/17/17.
 */
@Entity
@Data
@ApiModel(value = "账户")
public class Account extends AbstractEntity {

  @ApiModelProperty("账户名称")
  @JsonProperty
  private String name;

  @OneToOne(targetEntity = User.class)
  @JoinColumn(name = "user_id")
  @ApiModelProperty("系统用户ID")
  @JsonIgnore
  private User user;

}
