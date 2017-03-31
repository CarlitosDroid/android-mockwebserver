package com.carlitosdroid.usingmockwebserver.util.api;



import com.carlitosdroid.usingmockwebserver.model.response.LoginResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by Ricardo Bravo on 2/06/16.
 * Created by Carlos Vargas on 2/06/16.
 */

public interface SampleApi {

    String HEADER_AUTHORIZATION = "Authorization";


    @GET("qod.json")
    Call<LoginResponse> loginGet();

    /*//@QueryMap(encoded=true)
    @GET(BuildConfig.URL_SEARCH)
    Call<OfferJobResponse> search(@Header(HEADER_AUTHORIZATION) String authorization,
                                  @QueryMap Map<String, String> options);

    @GET(BuildConfig.URL_SYNCHRONIZE)
    Call<SynchronizeResponse> synchronize(@Header(HEADER_AUTHORIZATION) String authorization);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_REGISTER)
    Call<RegisterResponse> register(@Body RegisterRequest registerRequest);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_LOGIN)
    Call<LoginResponse> login(@Body LoginRequest loginRequest);


    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_RECOVERY_PASSWORD)
    Call<RecoveryPasswordResponse> recoveryPassword(@Header(HEADER_AUTHORIZATION) String authorization,
                                                    @Body RecoveryPasswordRequest recoveryPasswordRequest);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_LOGOUT)
    Call<LogoutResponse> logout(@Header(HEADER_AUTHORIZATION) String authorization,
                                @Body LogoutRequest logoutRequest);

    @GET(BuildConfig.URL_DETAIL)
    Call<DetailResponse> detail(@Header(HEADER_AUTHORIZATION) String authorization,
                                @Path("id") String id);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_IMAGE_PUT)
    Call<ProfileImageResponse> profileImage(@Header(HEADER_AUTHORIZATION) String authorization,
                                            @Path("postulant_id") int postulant_id,
                                            @Body ProfileImageRequest profileImageRequest);


    @GET(BuildConfig.URL_PROFILE_INFORMATION)
    Call<ProfileInformationResponse> profileInformation(@Header(HEADER_AUTHORIZATION) String authorization,
                                                        @Path("id") int id);
    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_INFORMATION)
    Call<InformationResponse> profileInformationPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                    @Path("id") int id, @Body MyDataRequest dataBean);

    @Headers("Content-Type: application/json")
    @GET(BuildConfig.URL_FAVORITE_GET_POST)
    Call<OfferJobResponse> getFavorite(@Header(HEADER_AUTHORIZATION) String authorization, @Path("postulant_id") int id);


    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_FAVORITE_GET_POST)
    Call<FavoritePostResponse> favoritePost(@Header(HEADER_AUTHORIZATION) String authorization,
                                            @Path("postulant_id") int postulant_id,
                                            @Body FavoriteRequest favoriteRequest);

    @DELETE(BuildConfig.URL_FAVORITE_DELETE)
    Call<FavoriteDeleteResponse> favoriteDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                @Path("postulant_id") int postulant_id,
                                                @Path("job_id") int job_id);

    @GET(BuildConfig.URL_PROCESSES)
    Call<ApplyResponse> apply(@Header(HEADER_AUTHORIZATION) String authorization, @Path("id") int id);

    @GET(BuildConfig.URL_PROFILE_EXPERIENCE_GET_POST)
    Call<ProfileExperienceGetResponse> profileExperience(@Header(HEADER_AUTHORIZATION) String authorization,
                                                         @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_EXPERIENCE_GET_POST)
    Call<ProfileExperiencePostResponse> profileExperiencePost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id, @Body ExperienceRequest experienceRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_EXPERIENCE_DELETE_PUT)
    Call<ProfileExperiencePutResponse> profileExperiencePut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                            @Path("id") int id,
                                                            @Body ExperienceRequest experienceRequest,
                                                            @Path("postulant_id") int postulant_id);

    @DELETE(BuildConfig.URL_PROFILE_EXPERIENCE_DELETE_PUT)
    Call<ProfileExperienceDeleteResponse> profileExperienceDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                                  @Path("id") int id,
                                                                  @Path("postulant_id") int postulant_id);

    @GET(BuildConfig.URL_PROFILE_EDUCATION_GET_POST)
    Call<ProfileEducationGetResponse> profileEducation(@Header(HEADER_AUTHORIZATION) String authorization,
                                                       @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_EDUCATION_GET_POST)
    Call<ProfileEducationPostResponse> profileEducationPost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                            @Path("id") int id, @Body EducationRequest educationRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_EDUCATION_DELETE_PUT)
    Call<ProfileEducationPutResponse> profileEducationPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                          @Path("postulant_id") int postulant_id,
                                                          @Body EducationRequest educationRequest,
                                                          @Path("id") int id);

    @DELETE(BuildConfig.URL_PROFILE_EDUCATION_DELETE_PUT)
    Call<ProfileEducationDeleteResponse> profileEducationDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                                @Path("id") int id,
                                                                @Path("postulant_id") int postulant_id);

    @GET(BuildConfig.URL_PROFILE_OTHER_STUDIES_GET_POST)
    Call<ProfileOtherStudiesGetResponse> profileOtherStudies(@Header(HEADER_AUTHORIZATION) String authorization,
                                                             @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_OTHER_STUDIES_GET_POST)
    Call<ProfileOtherStudyPostResponse> profileOtherStudyPost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id, @Body OtherStudyRequest otherStudyRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_OTHER_STUDIES_DELETE_PUT)
    Call<ProfileOtherStudyPutResponse> profileOtherStudyPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                            @Path("postulant_id") int postulant_id,
                                                            @Body OtherStudyRequest otherStudyRequest,
                                                            @Path("id") int id);

    @DELETE(BuildConfig.URL_PROFILE_OTHER_STUDIES_DELETE_PUT)
    Call<ProfileOtherStudiesDeleteResponse> profileOtherStudyDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                                    @Path("id") int id,
                                                                    @Path("postulant_id") int postulant_id);

    @GET(BuildConfig.URL_PROFILE_LANGUAGE_GET_POST)
    Call<ProfileLanguageGetResponse> profileLanguageGet(@Header(HEADER_AUTHORIZATION) String authorization,
                                                        @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_LANGUAGE_GET_POST)
    Call<ProfileLanguagePostResponse> profileLanguagePost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                          @Path("id") int id,
                                                          @Body LanguageRequest languageRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_LANGUAGE_DELETE_PUT)
    Call<ProfileLanguagePutResponse> profileLanguagePut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                        @Path("postulant_id") int postulant_id,
                                                        @Path("id") int id,
                                                        @Body LanguageRequest languageRequest);

    @DELETE(BuildConfig.URL_PROFILE_LANGUAGE_DELETE_PUT)
    Call<ProfileLanguageDeleteResponse> profileLanguageDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id,
                                                              @Path("postulant_id") int postulant_id);

    @GET(BuildConfig.URL_PROFILE_ACHIEVEMENT_GET_POST)
    Call<ProfileAchievementGetResponse> profileAchievementGet(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id);


    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_ACHIEVEMENT_GET_POST)
    Call<ProfileAchievementPostResponse> profileAchievementPost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                                @Path("id") int id,
                                                                @Body AchievementRequest achievementRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_ACHIEVEMENT_DELETE_PUT)
    Call<ProfileAchievementPutResponse> profileAchievementPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id,
                                                              @Path("postulant_id") int postulant_id,
                                                              @Body AchievementRequest achievementRequest);


    @DELETE(BuildConfig.URL_PROFILE_ACHIEVEMENT_DELETE_PUT)
    Call<ProfileAchievementDeleteResponse> profileAchievementDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                                    @Path("id") int id,
                                                                    @Path("postulant_id") int postulant_id);

    @GET(BuildConfig.URL_PROFILE_PROGRAMS_GET_POST)
    Call<ProfileProgramsGetResponse> profileProgramsGet(@Header(HEADER_AUTHORIZATION) String authorization,
                                                        @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_PROGRAMS_GET_POST)
    Call<ProfileProgramsPostResponse> profileProgramsPost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                          @Path("id") int id,
                                                          @Body ProgramsRequest programsRequest);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_PROGRAMS_DELETE_PUT)
    Call<ProfileProgramsPutResponse> profileProgramsPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                        @Path("id") int id,
                                                        @Path("postulant_id") int postulant_id,
                                                        @Body ProgramsRequest programsRequest);

    @DELETE(BuildConfig.URL_PROFILE_PROGRAMS_DELETE_PUT)
    Call<ProfileProgramsDeleteResponse> profileProgramsDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                              @Path("id") int id,
                                                              @Path("postulant_id") int postulant_id);


    @GET(BuildConfig.URL_PROFILE_SKILLS)
    Call<ProfileSkillsGetResponse> profileSkillsGet(@Header(HEADER_AUTHORIZATION) String authorization,
                                                    @Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST(BuildConfig.URL_PROFILE_SKILLS)
    Call<ProfileSkillsPostResponse> profileSkillsPost(@Header(HEADER_AUTHORIZATION) String authorization,
                                                      @Path("id") int id, @Body SkillRequestPost skillRequestPost);

    @Headers("Content-Type: application/json")
    @DELETE(BuildConfig.URL_PROFILE_SKILLS_DELETE_PUT)
    Call<ProfileSkillsDeleteResponse> profileSkillDelete(@Header(HEADER_AUTHORIZATION) String authorization,
                                                         @Path("postulant_id") int postulant_id, @Path("id") int id);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_PROFILE_SKILLS_DELETE_PUT)
    Call<ProfileSkillsPutResponse> profileSkillPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                   @Path("postulant_id") int postulant_id, @Path("id") int id,
                                                   @Body SkillRequestPut skillRequestPut);

    @Headers("Content-Type: application/json")
    @PUT(BuildConfig.URL_NOTIFICATIONS_PUT)
    Call<NotificationPutResponse> notificationPut(@Header(HEADER_AUTHORIZATION) String authorization,
                                                  @Path("postulant_id") int postulant_id,
                                                  @Path("id") int id);*/


}
