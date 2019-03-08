// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1/job.proto

package com.google.cloud.scheduler.v1;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_RetryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/scheduler/v1/job.proto\022\031g"
          + "oogle.cloud.scheduler.v1\032\034google/api/ann"
          + "otations.proto\032&google/cloud/scheduler/v"
          + "1/target.proto\032\036google/protobuf/duration"
          + ".proto\032\037google/protobuf/timestamp.proto\032"
          + "\027google/rpc/status.proto\"\272\005\n\003Job\022\014\n\004name"
          + "\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022@\n\rpubsub_ta"
          + "rget\030\004 \001(\0132\'.google.cloud.scheduler.v1.P"
          + "ubsubTargetH\000\022P\n\026app_engine_http_target\030"
          + "\005 \001(\0132..google.cloud.scheduler.v1.AppEng"
          + "ineHttpTargetH\000\022<\n\013http_target\030\006 \001(\0132%.g"
          + "oogle.cloud.scheduler.v1.HttpTargetH\000\022\020\n"
          + "\010schedule\030\024 \001(\t\022\021\n\ttime_zone\030\025 \001(\t\0224\n\020us"
          + "er_update_time\030\t \001(\0132\032.google.protobuf.T"
          + "imestamp\0223\n\005state\030\n \001(\0162$.google.cloud.s"
          + "cheduler.v1.Job.State\022\"\n\006status\030\013 \001(\0132\022."
          + "google.rpc.Status\0221\n\rschedule_time\030\021 \001(\013"
          + "2\032.google.protobuf.Timestamp\0225\n\021last_att"
          + "empt_time\030\022 \001(\0132\032.google.protobuf.Timest"
          + "amp\022<\n\014retry_config\030\023 \001(\0132&.google.cloud"
          + ".scheduler.v1.RetryConfig\"X\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022\n\n\006PAUSED"
          + "\020\002\022\014\n\010DISABLED\020\003\022\021\n\rUPDATE_FAILED\020\004B\010\n\006t"
          + "arget\"\342\001\n\013RetryConfig\022\023\n\013retry_count\030\001 \001"
          + "(\005\0225\n\022max_retry_duration\030\002 \001(\0132\031.google."
          + "protobuf.Duration\0227\n\024min_backoff_duratio"
          + "n\030\003 \001(\0132\031.google.protobuf.Duration\0227\n\024ma"
          + "x_backoff_duration\030\004 \001(\0132\031.google.protob"
          + "uf.Duration\022\025\n\rmax_doublings\030\005 \001(\005Bo\n\035co"
          + "m.google.cloud.scheduler.v1B\010JobProtoP\001Z"
          + "Bgoogle.golang.org/genproto/googleapis/c"
          + "loud/scheduler/v1;schedulerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.scheduler.v1.TargetProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_scheduler_v1_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "PubsubTarget",
              "AppEngineHttpTarget",
              "HttpTarget",
              "Schedule",
              "TimeZone",
              "UserUpdateTime",
              "State",
              "Status",
              "ScheduleTime",
              "LastAttemptTime",
              "RetryConfig",
              "Target",
            });
    internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1_RetryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor,
            new java.lang.String[] {
              "RetryCount",
              "MaxRetryDuration",
              "MinBackoffDuration",
              "MaxBackoffDuration",
              "MaxDoublings",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.scheduler.v1.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
