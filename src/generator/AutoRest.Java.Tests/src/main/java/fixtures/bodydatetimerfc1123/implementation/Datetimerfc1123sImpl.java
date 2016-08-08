/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import retrofit2.Retrofit;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123s.
 */
public final class Datetimerfc1123sImpl implements Datetimerfc1123s {
    /** The Retrofit service to perform REST calls. */
    private Datetimerfc1123sService service;
    /** The service client containing this operation class. */
    private AutoRestRFC1123DateTimeTestServiceImpl client;

    /**
     * Initializes an instance of Datetimerfc1123s.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123sImpl(Retrofit retrofit, AutoRestRFC1123DateTimeTestServiceImpl client) {
        this.service = retrofit.create(Datetimerfc1123sService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123s to be
     * used by Retrofit to perform actually REST calls.
     */
    interface Datetimerfc1123sService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/invalid")
        Call<ResponseBody> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/overflow")
        Call<ResponseBody> getOverflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/underflow")
        Call<ResponseBody> getUnderflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/max")
        Call<ResponseBody> putUtcMaxDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/lowercase")
        Call<ResponseBody> getUtcLowercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/uppercase")
        Call<ResponseBody> getUtcUppercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/min")
        Call<ResponseBody> putUtcMinDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/min")
        Call<ResponseBody> getUtcMinDateTime();

    }

    /**
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        ServiceResponse<DateTimeRfc1123> response = getNullDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getNullAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getNullDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        ServiceResponse<DateTimeRfc1123> response = getInvalidDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getInvalidDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getOverflow() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflow();
        ServiceResponse<DateTimeRfc1123> response = getOverflowDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getOverflow();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getOverflowDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUnderflow() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflow();
        ServiceResponse<DateTimeRfc1123> response = getUnderflowDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflow();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getUnderflowDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMaxDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBodyConverted);
        return putUtcMaxDateTimeDelegate(call.execute());
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        Call<ResponseBody> call = service.putUtcMaxDateTime(datetimeBodyConverted);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putUtcMaxDateTimeDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcLowercaseMaxDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
        ServiceResponse<DateTimeRfc1123> response = getUtcLowercaseMaxDateTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getUtcLowercaseMaxDateTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getUtcLowercaseMaxDateTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcUppercaseMaxDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
        ServiceResponse<DateTimeRfc1123> response = getUtcUppercaseMaxDateTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getUtcUppercaseMaxDateTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getUtcUppercaseMaxDateTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMinDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBodyConverted);
        return putUtcMinDateTimeDelegate(call.execute());
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        Call<ResponseBody> call = service.putUtcMinDateTime(datetimeBodyConverted);
        final ServiceCall<Void> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<Void> clientResponse = putUtcMinDateTimeDelegate(response);
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcMinDateTime() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUtcMinDateTime();
        ServiceResponse<DateTimeRfc1123> response = getUtcMinDateTimeDelegate(call.execute());
        DateTime body = null;
        if (response.getBody() != null) {
            body = response.getBody().getDateTime();
        }
        return new ServiceResponse<DateTime>(body, response.getResponse());
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<DateTime> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        Call<ResponseBody> call = service.getUtcMinDateTime();
        final ServiceCall<DateTime> serviceCall = new ServiceCall<>(call);
        call.enqueue(new ServiceResponseCallback<DateTime>(serviceCall, serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<DateTimeRfc1123> result = getUtcMinDateTimeDelegate(response);
                    DateTime body = null;
                    if (result.getBody() != null) {
                        body = result.getBody().getDateTime();
                    }
                    ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                    if (serviceCallback != null) {
                        serviceCallback.success(clientResponse);
                    }
                    serviceCall.success(clientResponse);
                } catch (ErrorException | IOException exception) {
                    if (serviceCallback != null) {
                        serviceCallback.failure(exception);
                    }
                    serviceCall.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}