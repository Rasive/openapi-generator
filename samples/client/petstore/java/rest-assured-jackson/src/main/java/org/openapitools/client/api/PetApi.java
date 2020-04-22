/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.*;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import static io.restassured.http.Method.*;

@Api(value = "Pet")
public class PetApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private PetApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static PetApi pet(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new PetApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                addPet(),
                deletePet(),
                findPetsByStatus(),
                findPetsByTags(),
                getPetById(),
                updatePet(),
                updatePetWithForm(),
                uploadFile(),
                uploadFileWithRequiredFile()
        );
    }

    @ApiOperation(value = "Add a new pet to the store",
            notes = "",
            nickname = "addPet",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 405, message = "Invalid input")  })
    public AddPetOper addPet() {
        return new AddPetOper(createReqSpec());
    }

    @ApiOperation(value = "Deletes a pet",
            notes = "",
            nickname = "deletePet",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid pet value")  })
    public DeletePetOper deletePet() {
        return new DeletePetOper(createReqSpec());
    }

    @ApiOperation(value = "Finds Pets by status",
            notes = "Multiple status values can be provided with comma separated strings",
            nickname = "findPetsByStatus",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid status value")  })
    public FindPetsByStatusOper findPetsByStatus() {
        return new FindPetsByStatusOper(createReqSpec());
    }

    @ApiOperation(value = "Finds Pets by tags",
            notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
            nickname = "findPetsByTags",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid tag value")  })
    @Deprecated
    public FindPetsByTagsOper findPetsByTags() {
        return new FindPetsByTagsOper(createReqSpec());
    }

    @ApiOperation(value = "Find pet by ID",
            notes = "Returns a single pet",
            nickname = "getPetById",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid ID supplied") ,
            @ApiResponse(code = 404, message = "Pet not found")  })
    public GetPetByIdOper getPetById() {
        return new GetPetByIdOper(createReqSpec());
    }

    @ApiOperation(value = "Update an existing pet",
            notes = "",
            nickname = "updatePet",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation") ,
            @ApiResponse(code = 400, message = "Invalid ID supplied") ,
            @ApiResponse(code = 404, message = "Pet not found") ,
            @ApiResponse(code = 405, message = "Validation exception")  })
    public UpdatePetOper updatePet() {
        return new UpdatePetOper(createReqSpec());
    }

    @ApiOperation(value = "Updates a pet in the store with form data",
            notes = "",
            nickname = "updatePetWithForm",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 405, message = "Invalid input")  })
    public UpdatePetWithFormOper updatePetWithForm() {
        return new UpdatePetWithFormOper(createReqSpec());
    }

    @ApiOperation(value = "uploads an image",
            notes = "",
            nickname = "uploadFile",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation")  })
    public UploadFileOper uploadFile() {
        return new UploadFileOper(createReqSpec());
    }

    @ApiOperation(value = "uploads an image (required)",
            notes = "",
            nickname = "uploadFileWithRequiredFile",
            tags = { "pet" })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "successful operation")  })
    public UploadFileWithRequiredFileOper uploadFileWithRequiredFile() {
        return new UploadFileWithRequiredFileOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public PetApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Add a new pet to the store
     * 
     *
     * @see #body Pet object that needs to be added to the store (required)
     */
    public static class AddPetOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/pet";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public AddPetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (Pet) Pet object that needs to be added to the store (required)
         * @return operation
         */
        public AddPetOper body(Pet body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public AddPetOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public AddPetOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Deletes a pet
     * 
     *
     * @see #petIdPath Pet id to delete (required)
     * @see #apiKeyHeader  (optional)
     */
    public static class DeletePetOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DeletePetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String API_KEY_HEADER = "api_key";

        /**
         * @param apiKey (String)  (optional)
         * @return operation
         */
        public DeletePetOper apiKeyHeader(String apiKey) {
            reqSpec.addHeader(API_KEY_HEADER, apiKey);
            return this;
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) Pet id to delete (required)
         * @return operation
         */
        public DeletePetOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DeletePetOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DeletePetOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @see #statusQuery Status values that need to be considered for filter (required)
     * return List&lt;Pet&gt;
     */
    public static class FindPetsByStatusOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pet/findByStatus";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public FindPetsByStatusOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/findByStatus
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /pet/findByStatus
         * @param handler handler
         * @return List&lt;Pet&gt;
         */
        public List<Pet> executeAs(Function<Response, Response> handler) {
            TypeRef<List<Pet>> type = new TypeRef<List<Pet>>(){};
            return execute(handler).as(type);
        }

        public static final String STATUS_QUERY = "status";

        /**
         * @param status (List&lt;String&gt;) Status values that need to be considered for filter (required)
         * @return operation
         */
        public FindPetsByStatusOper statusQuery(Object... status) {
            reqSpec.addQueryParam(STATUS_QUERY, status);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public FindPetsByStatusOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public FindPetsByStatusOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @see #tagsQuery Tags to filter by (required)
     * return List&lt;Pet&gt;
     * @deprecated
     */
    @Deprecated
    public static class FindPetsByTagsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pet/findByTags";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public FindPetsByTagsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/findByTags
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /pet/findByTags
         * @param handler handler
         * @return List&lt;Pet&gt;
         */
        public List<Pet> executeAs(Function<Response, Response> handler) {
            TypeRef<List<Pet>> type = new TypeRef<List<Pet>>(){};
            return execute(handler).as(type);
        }

        public static final String TAGS_QUERY = "tags";

        /**
         * @param tags (List&lt;String&gt;) Tags to filter by (required)
         * @return operation
         */
        public FindPetsByTagsOper tagsQuery(Object... tags) {
            reqSpec.addQueryParam(TAGS_QUERY, tags);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public FindPetsByTagsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public FindPetsByTagsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Find pet by ID
     * Returns a single pet
     *
     * @see #petIdPath ID of pet to return (required)
     * return Pet
     */
    public static class GetPetByIdOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetPetByIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /pet/{petId}
         * @param handler handler
         * @return Pet
         */
        public Pet executeAs(Function<Response, Response> handler) {
            TypeRef<Pet> type = new TypeRef<Pet>(){};
            return execute(handler).as(type);
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet to return (required)
         * @return operation
         */
        public GetPetByIdOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetPetByIdOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetPetByIdOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Update an existing pet
     * 
     *
     * @see #body Pet object that needs to be added to the store (required)
     */
    public static class UpdatePetOper implements Oper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/pet";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UpdatePetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /pet
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

         /**
         * @param body (Pet) Pet object that needs to be added to the store (required)
         * @return operation
         */
        public UpdatePetOper body(Pet body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UpdatePetOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UpdatePetOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Updates a pet in the store with form data
     * 
     *
     * @see #petIdPath ID of pet that needs to be updated (required)
     * @see #nameForm Updated name of the pet (optional)
     * @see #statusForm Updated status of the pet (optional)
     */
    public static class UpdatePetWithFormOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/pet/{petId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UpdatePetWithFormOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet/{petId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet that needs to be updated (required)
         * @return operation
         */
        public UpdatePetWithFormOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

         public static final String NAME_FORM = "name";

         /**
         * @param name (String) Updated name of the pet (optional)
         * @return operation
         */
         public UpdatePetWithFormOper nameForm(Object... name) {
            reqSpec.addFormParam(NAME_FORM, name);
            return this;
         }

         public static final String STATUS_FORM = "status";

         /**
         * @param status (String) Updated status of the pet (optional)
         * @return operation
         */
         public UpdatePetWithFormOper statusForm(Object... status) {
            reqSpec.addFormParam(STATUS_FORM, status);
            return this;
         }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UpdatePetWithFormOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UpdatePetWithFormOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * uploads an image
     * 
     *
     * @see #petIdPath ID of pet to update (required)
     * @see #additionalMetadataForm Additional data to pass to server (optional)
     * @see #fileMultiPart file to upload (optional)
     * return ModelApiResponse
     */
    public static class UploadFileOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/pet/{petId}/uploadImage";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UploadFileOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("multipart/form-data");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /pet/{petId}/uploadImage
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /pet/{petId}/uploadImage
         * @param handler handler
         * @return ModelApiResponse
         */
        public ModelApiResponse executeAs(Function<Response, Response> handler) {
            TypeRef<ModelApiResponse> type = new TypeRef<ModelApiResponse>(){};
            return execute(handler).as(type);
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet to update (required)
         * @return operation
         */
        public UploadFileOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

         public static final String ADDITIONAL_METADATA_FORM = "additionalMetadata";

         /**
         * @param additionalMetadata (String) Additional data to pass to server (optional)
         * @return operation
         */
         public UploadFileOper additionalMetadataForm(Object... additionalMetadata) {
            reqSpec.addFormParam(ADDITIONAL_METADATA_FORM, additionalMetadata);
            return this;
         }

         /**
         * It will assume that the control name is file and the &lt;content-type&gt; is &lt;application/octet-stream&gt;
         * @see #reqSpec for customise
         * @param file (File) file to upload (optional)
         * @return operation
         */
         public UploadFileOper fileMultiPart(File file) {
            reqSpec.addMultiPart(file);
            return this;
         }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UploadFileOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UploadFileOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * uploads an image (required)
     * 
     *
     * @see #petIdPath ID of pet to update (required)
     * @see #requiredFileMultiPart file to upload (required)
     * @see #additionalMetadataForm Additional data to pass to server (optional)
     * return ModelApiResponse
     */
    public static class UploadFileWithRequiredFileOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/fake/{petId}/uploadImageWithRequiredFile";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UploadFileWithRequiredFileOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("multipart/form-data");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fake/{petId}/uploadImageWithRequiredFile
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /fake/{petId}/uploadImageWithRequiredFile
         * @param handler handler
         * @return ModelApiResponse
         */
        public ModelApiResponse executeAs(Function<Response, Response> handler) {
            TypeRef<ModelApiResponse> type = new TypeRef<ModelApiResponse>(){};
            return execute(handler).as(type);
        }

        public static final String PET_ID_PATH = "petId";

        /**
         * @param petId (Long) ID of pet to update (required)
         * @return operation
         */
        public UploadFileWithRequiredFileOper petIdPath(Object petId) {
            reqSpec.addPathParam(PET_ID_PATH, petId);
            return this;
        }

         public static final String ADDITIONAL_METADATA_FORM = "additionalMetadata";

         /**
         * @param additionalMetadata (String) Additional data to pass to server (optional)
         * @return operation
         */
         public UploadFileWithRequiredFileOper additionalMetadataForm(Object... additionalMetadata) {
            reqSpec.addFormParam(ADDITIONAL_METADATA_FORM, additionalMetadata);
            return this;
         }

         /**
         * It will assume that the control name is file and the &lt;content-type&gt; is &lt;application/octet-stream&gt;
         * @see #reqSpec for customise
         * @param requiredFile (File) file to upload (required)
         * @return operation
         */
         public UploadFileWithRequiredFileOper requiredFileMultiPart(File requiredFile) {
            reqSpec.addMultiPart(requiredFile);
            return this;
         }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UploadFileWithRequiredFileOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UploadFileWithRequiredFileOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
