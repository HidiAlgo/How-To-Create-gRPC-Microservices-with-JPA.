package com.students_information.stubs.result;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Now let's define our service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: result.proto")
public final class ResultServiceGrpc {

  private ResultServiceGrpc() {}

  public static final String SERVICE_NAME = "com.students_information.stubs.result.ResultService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.students_information.stubs.result.ResultRequest,
      com.students_information.stubs.result.ResultResponse> getGetResultForStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultForStudent",
      requestType = com.students_information.stubs.result.ResultRequest.class,
      responseType = com.students_information.stubs.result.ResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.students_information.stubs.result.ResultRequest,
      com.students_information.stubs.result.ResultResponse> getGetResultForStudentMethod() {
    io.grpc.MethodDescriptor<com.students_information.stubs.result.ResultRequest, com.students_information.stubs.result.ResultResponse> getGetResultForStudentMethod;
    if ((getGetResultForStudentMethod = ResultServiceGrpc.getGetResultForStudentMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getGetResultForStudentMethod = ResultServiceGrpc.getGetResultForStudentMethod) == null) {
          ResultServiceGrpc.getGetResultForStudentMethod = getGetResultForStudentMethod =
              io.grpc.MethodDescriptor.<com.students_information.stubs.result.ResultRequest, com.students_information.stubs.result.ResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResultForStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.students_information.stubs.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.students_information.stubs.result.ResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("getResultForStudent"))
              .build();
        }
      }
    }
    return getGetResultForStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResultServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceStub>() {
        @java.lang.Override
        public ResultServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceStub(channel, callOptions);
        }
      };
    return ResultServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceBlockingStub>() {
        @java.lang.Override
        public ResultServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceBlockingStub(channel, callOptions);
        }
      };
    return ResultServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceFutureStub>() {
        @java.lang.Override
        public ResultServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceFutureStub(channel, callOptions);
        }
      };
    return ResultServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static abstract class ResultServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getResultForStudent(com.students_information.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.students_information.stubs.result.ResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResultForStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResultForStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.students_information.stubs.result.ResultRequest,
                com.students_information.stubs.result.ResultResponse>(
                  this, METHODID_GET_RESULT_FOR_STUDENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceStub extends io.grpc.stub.AbstractAsyncStub<ResultServiceStub> {
    private ResultServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceStub(channel, callOptions);
    }

    /**
     */
    public void getResultForStudent(com.students_information.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.students_information.stubs.result.ResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResultForStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResultServiceBlockingStub> {
    private ResultServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.students_information.stubs.result.ResultResponse getResultForStudent(com.students_information.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultForStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResultServiceFutureStub> {
    private ResultServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.students_information.stubs.result.ResultResponse> getResultForStudent(
        com.students_information.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResultForStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT_FOR_STUDENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResultServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResultServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT_FOR_STUDENT:
          serviceImpl.getResultForStudent((com.students_information.stubs.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<com.students_information.stubs.result.ResultResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResultServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.students_information.stubs.result.Result.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResultService");
    }
  }

  private static final class ResultServiceFileDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier {
    ResultServiceFileDescriptorSupplier() {}
  }

  private static final class ResultServiceMethodDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResultServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ResultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResultServiceFileDescriptorSupplier())
              .addMethod(getGetResultForStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
