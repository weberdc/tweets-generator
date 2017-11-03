/*
 * Copyright 2017 Derek Weber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dcw.twitter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class User {

    @JsonProperty("id")
    private Long id = 123L;
    @JsonProperty("id_str")
    private String id_str = "123";
    @JsonProperty("name")
    private String name = "My name";
    @JsonProperty("screen_name")
    private String screen_name = "MyScreenName";
    @JsonProperty("location")
    private String location = "Adelaide, Australia";
    @JsonProperty("url")
    private String url = "http://www.anon.com/";
    @JsonProperty("description")
    private String description = "My description";
    @JsonProperty("derived")
    private Map<String,List<?>> derived = Collections.emptyMap();
    @JsonProperty("protected")
    private Boolean isProtected = false;
    @JsonProperty("verified")
    private Boolean verified = false;
    @JsonProperty("followers_count")
    private Integer followers_count = 300;
    @JsonProperty("friends_count")
    private Integer friends_count = 123;
    @JsonProperty("listed_count")
    private Integer listed_count = 3;
    @JsonProperty("favourites_count")
    private Integer favourites_count = 123;
    @JsonProperty("statuses_count")
    private Integer statuses_count = 123;
    @JsonProperty("created_at")
    private String created_at = "Mon Jun 23 14:58:23 +0000 2008";
    @JsonProperty("utc_offset")
    private Integer utc_offset = 36000;
    @JsonProperty("time_zone")
    private String time_zone = "Adelaide";
    @JsonProperty("geo_enabled")
    private Boolean geo_enabled = true;
    @JsonProperty("lang")
    private String lang = "en";
    @JsonProperty("contributors_enabled")
    private Boolean contributors_enabled = false;
    @JsonProperty("profile_background_color")
    private String profile_background_color = "000000";
    @JsonProperty("profile_background_image_url")
    private String profile_background_image_url = "http://pbs.twimg.com/profile_background_images/120284187/twilk_background_4c3334d4eb51c.jpg";
    @JsonProperty("profile_background_image_url_https")
    private String profile_background_image_url_https = "https://pbs.twimg.com/profile_background_images/120284187/twilk_background_4c3334d4eb51c.jpg";
    @JsonProperty("profile_background_tile")
    private Boolean profile_background_tile = true;
    @JsonProperty("profile_banner_url")
    private String profile_banner_url = "https://pbs.twimg.com/profile_banners/15207848/1427712865";
    @JsonProperty("profile_image_url")
    private String profile_image_url = "http://pbs.twimg.com/profile_images/752375634987331585/18UAdQ13_normal.jpg";
    @JsonProperty("profile_image_url_https")
    private String profile_image_url_https = "https://pbs.twimg.com/profile_images/752375634987331585/18UAdQ13_normal.jpg";
    @JsonProperty("profile_link_color")
    private String profile_link_color = "CC3300";
    @JsonProperty("profile_sidebar_border_color")
    private String profile_sidebar_border_color = "FFFFFF";
    @JsonProperty("profile_sidebar_fill_color")
    private String profile_sidebar_fill_color = "F7DA93";
    @JsonProperty("profile_text_color")
    private String profile_text_color = "000000";
    @JsonProperty("profile_use_background_image")
    private Boolean profile_use_background_image = true;
    @JsonProperty("default_profile")
    private Boolean default_profile = true;
    @JsonProperty("default_profile_image")
    private Boolean default_profile_image = false;
    @JsonProperty("withheld_in_countries")
    private String withheld_in_countries = "";
    @JsonProperty("withheld_scope")
    private String withheld_scope = "";

    public User(
        @JsonProperty("id")
        final Long id,
        @JsonProperty("id_str")
        final String id_str,
        @JsonProperty("name")
        final String name,
        @JsonProperty("screen_name")
        final String screen_name,
        @JsonProperty("location")
        final String location,
        @JsonProperty("url")
        final String url,
        @JsonProperty("description")
        final String description,
        @JsonProperty("derived")
        final Map<String, List<?>> derived,
        @JsonProperty("protetcted")
        final Boolean isProtected,
        @JsonProperty("verified")
        final Boolean verified,
        @JsonProperty("followers_count")
        final Integer followers_count,
        @JsonProperty("friends_count")
        final Integer friends_count,
        @JsonProperty("listed_count")
        final Integer listed_count,
        @JsonProperty("favourites_count")
        final Integer favourites_count,
        @JsonProperty("statuses_count")
        final Integer statuses_count,
        @JsonProperty("created_at")
        final String created_at,
        @JsonProperty("utc_offset")
        final Integer utc_offset,
        @JsonProperty("time_zone")
        final String time_zone,
        @JsonProperty("geo_enabled")
        final Boolean geo_enabled,
        @JsonProperty("lang")
        final String lang,
        @JsonProperty("contributors_enabled")
        final Boolean contributors_enabled,
        @JsonProperty("profile_background_color")
        final String profile_background_color,
        @JsonProperty("profile_background_image_url")
        final String profile_background_image_url,
        @JsonProperty("profile_background_image_url_https")
        final String profile_background_image_url_https,
        @JsonProperty("profile_background_tile")
        final Boolean profile_background_tile,
        @JsonProperty("profile_banner_url")
        final String profile_banner_url,
        @JsonProperty("profile_image_url")
        final String profile_image_url,
        @JsonProperty("profile_image_url_https")
        final String profile_image_url_https,
        @JsonProperty("profile_link_color")
        final String profile_link_color,
        @JsonProperty("profile_sidebar_border_color")
        final String profile_sidebar_border_color,
        @JsonProperty("profile_sidebar_fill_color")
        final String profile_sidebar_fill_color,
        @JsonProperty("profile_text_color")
        final String profile_text_color,
        @JsonProperty("profile_use_background_image")
        final Boolean profile_use_background_image,
        @JsonProperty("default_profile")
        final Boolean default_profile,
        @JsonProperty("default_profile_image")
        final Boolean default_profile_image,
        @JsonProperty("withheld_in_countries")
        final String withheld_in_countries,
        @JsonProperty("withheld_scope")
        final String withheld_scope
    ) {
        this.id = id;
        this.id_str = id_str;
        this.name = name;
        this.screen_name = screen_name;
        this.location = location;
        this.url = url;
        this.description = description;
        this.derived = derived;
        this.isProtected = isProtected;
        this.verified = verified;
        this.followers_count = followers_count;
        this.friends_count = friends_count;
        this.listed_count = listed_count;
        this.favourites_count = favourites_count;
        this.statuses_count = statuses_count;
        this.created_at = created_at;
        this.utc_offset = utc_offset;
        this.time_zone = time_zone;
        this.geo_enabled = geo_enabled;
        this.lang = lang;
        this.contributors_enabled = contributors_enabled;
        this.profile_background_color = profile_background_color;
        this.profile_background_image_url = profile_background_image_url;
        this.profile_background_image_url_https = profile_background_image_url_https;
        this.profile_background_tile = profile_background_tile;
        this.profile_banner_url = profile_banner_url;
        this.profile_image_url = profile_image_url;
        this.profile_image_url_https = profile_image_url_https;
        this.profile_link_color = profile_link_color;
        this.profile_sidebar_border_color = profile_sidebar_border_color;
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
        this.profile_text_color = profile_text_color;
        this.profile_use_background_image = profile_use_background_image;
        this.default_profile = default_profile;
        this.default_profile_image = default_profile_image;
        this.withheld_in_countries = withheld_in_countries;
        this.withheld_scope = withheld_scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id_str.equals(user.id_str);
    }

    @Override
    public int hashCode() {
        return id_str.hashCode();
    }

    public Long getId() {
        return id;
    }

    public String getId_str() {
        return id_str;
    }

    public String getName() {
        return name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public String getLocation() {
        return location;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, List<?>> getDerived() {
        return derived;
    }

    public Boolean getProtected() {
        return isProtected;
    }

    public Boolean getVerified() {
        return verified;
    }

    public Integer getFollowers_count() {
        return followers_count;
    }

    public Integer getFriends_count() {
        return friends_count;
    }

    public Integer getListed_count() {
        return listed_count;
    }

    public Integer getFavourites_count() {
        return favourites_count;
    }

    public Integer getStatuses_count() {
        return statuses_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Integer getUtc_offset() {
        return utc_offset;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    public String getLang() {
        return lang;
    }

    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    public String getProfile_banner_url() {
        return profile_banner_url;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    public String getProfile_link_color() {
        return profile_link_color;
    }

    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    public String getProfile_text_color() {
        return profile_text_color;
    }

    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    public Boolean getDefault_profile() {
        return default_profile;
    }

    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    public String getWithheld_in_countries() {
        return withheld_in_countries;
    }

    public String getWithheld_scope() {
        return withheld_scope;
    }
}
