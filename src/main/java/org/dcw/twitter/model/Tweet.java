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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Description of Tweet JavaBean.
 *
 * @author derek
 */
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Tweet {

    @JsonProperty("coordinates")
    private Map<String,?> coordinates;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("current_user_retweet")
    private Map<String,?> current_user_retweet;
    @JsonProperty("entities")
    private Map<String,?> entities;
    @JsonProperty("extended_entities")
    private Map<String,?> extended_entities;
    @JsonProperty("favorite_count")
    private Integer favorite_count;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("filter_level")
    private String filter_level;
    @JsonProperty("geo")
    private Map<String,?> geo;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("in_reply_to_screen_name")
    private String in_reply_to_screen_name;
    @JsonProperty("in_reply_to_status_id")
    private Long in_reply_to_status_id;
    @JsonProperty("in_reply_to_status_id_str")
    private String in_reply_to_status_id_str;
    @JsonProperty("in_reply_to_user_id")
    private Long in_reply_to_user_id;
    @JsonProperty("in_reply_to_user_id_str")
    private String in_reply_to_user_id_str;
    @JsonProperty("is_quote_status")
    private Boolean is_quote_status;
    @JsonProperty("id_str")
    private String id_str;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("matching_rules")
    private List<Map<String,?>> matching_rules;
    @JsonProperty("place")
    private Map<String,?> place;
    @JsonProperty("possibly_sensitive")
    private Boolean possibly_sensitive;
    @JsonProperty("quote_count")
    private Integer quote_count;
    @JsonProperty("quoted_status")
    private Tweet quoted_status;
    @JsonProperty("quoted_status_id")
    private Long quoted_status_id;
    @JsonProperty("quoted_status_id_str")
    private String quoted_status_id_str;
    @JsonProperty("reply_count")
    private Integer reply_count;
    @JsonProperty("retweet_count")
    private Integer retweet_count;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweeted_status")
    private Tweet retweeted_status;
    @JsonProperty("scopes")
    private Map<String,?> scopes;
    @JsonProperty("source")
    private String source;
    @JsonProperty("text")
    private String text;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("user")
    private User user;
    @JsonProperty("withheld_copyright")
    private Boolean withheld_copyright;
    @JsonProperty("withheld_in_countries")
    private List<String> withheld_in_countries;
    @JsonProperty("withheld_scope")
    private String withheld_scope;

    /**
     * Constructor.
     *
     * @param coordinates The <code>coordinates</code> property.
     * @param created_at The <code>created_at</code> property.
     * @param current_user_retweet The <code>current_user_retweet</code> property.
     * @param entities The <code>entities</code> property.
     * @param extended_entities The <code>extended_entities</code> property.
     * @param favorite_count The <code>favorite_count</code> property.
     * @param favorited The <code>favorited</code> property.
     * @param filter_level The <code>filter_level</code> property.
     * @param geo The <code>geo</code> property.
     * @param id The <code>id</code> property.
     * @param in_reply_to_screen_name The <code>in_reply_to_screen_name</code> property.
     * @param in_reply_to_status_id The <code>in_reply_to_status_id</code> property.
     * @param in_reply_to_status_id_str The <code>in_reply_to_status_id_str</code> property.
     * @param in_reply_to_user_id The <code>in_reply_to_user_id</code> property.
     * @param in_reply_to_user_id_str The <code>in_reply_to_user_id_str</code> property.
     * @param is_quote_status The <code>is_quote_status</code> property.
     * @param id_str The <code>id_str</code> property.
     * @param lang The <code>lang</code> property.
     * @param matching_rules The <code>matching_rules</code> property.
     * @param place The <code>place</code> property.
     * @param possibly_sensitive The <code>possibly_sensitive</code> property.
     * @param quote_count The <code>quote_count</code> property.
     * @param quoted_status The <code>quoted_status</code> property.
     * @param quoted_status_id The <code>quoted_status_id</code> property.
     * @param quoted_status_id_str The <code>quoted_status_id_str</code> property.
     * @param reply_count The <code>reply_count</code> property.
     * @param retweet_count The <code>retweet_count</code> property.
     * @param retweeted The <code>retweeted</code> property.
     * @param retweeted_status The <code>retweeted_status</code> property.
     * @param scopes The <code>scopes</code> property.
     * @param source The <code>source</code> property.
     * @param text The <code>text</code> property.
     * @param truncated The <code>truncated</code> property.
     * @param user The <code>user</code> property.
     * @param withheld_copyright The <code>withheld_copyright</code> property.
     * @param withheld_in_countries The <code>withheld_in_countries</code> property.
     * @param withheld_scope The <code>withheld_scope</code> property.
     */
    public Tweet(
        @JsonProperty("coordinates")
        final Map<String,?> coordinates,
        @JsonProperty("created_at")
        final String created_at,
        @JsonProperty("current_user_retweet")
        final Map<String,?> current_user_retweet,
        @JsonProperty("entities")
        final Map<String,?> entities,
        @JsonProperty("extended_entities")
        final Map<String,?> extended_entities,
        @JsonProperty("favorite_count")
        final Integer favorite_count,
        @JsonProperty("favorited")
        final Boolean favorited,
        @JsonProperty("filter_level")
        final String filter_level,
        @JsonProperty("geo")
        final Map<String,?> geo,
        @JsonProperty("id")
        final Long id,
        @JsonProperty("in_reply_to_screen_name")
        final String in_reply_to_screen_name,
        @JsonProperty("in_reply_to_status_id")
        final Long in_reply_to_status_id,
        @JsonProperty("in_reply_to_status_id_str")
        final String in_reply_to_status_id_str,
        @JsonProperty("in_reply_to_user_id")
        final Long in_reply_to_user_id,
        @JsonProperty("in_reply_to_user_id_str")
        final String in_reply_to_user_id_str,
        @JsonProperty("is_quote_status")
        final Boolean is_quote_status,
        @JsonProperty("id_str")
        final String id_str,
        @JsonProperty("lang")
        final String lang,
        @JsonProperty("matching_rules")
        final List<Map<String,?>> matching_rules,
        @JsonProperty("place")
        final Map<String,?> place,
        @JsonProperty("possibly_sensitive")
        final Boolean possibly_sensitive,
        @JsonProperty("quote_count")
        final Integer quote_count,
        @JsonProperty("quoted_status")
        final Tweet quoted_status,
        @JsonProperty("quoted_status_id")
        final Long quoted_status_id,
        @JsonProperty("quoted_status_id_str")
        final String quoted_status_id_str,
        @JsonProperty("reply_count")
        final Integer reply_count,
        @JsonProperty("retweet_count")
        final Integer retweet_count,
        @JsonProperty("retweeted")
        final Boolean retweeted,
        @JsonProperty("retweeted_status")
        final Tweet retweeted_status,
        @JsonProperty("scopes")
        final Map<String,?> scopes,
        @JsonProperty("source")
        final String source,
        @JsonProperty("text")
        final String text,
        @JsonProperty("truncated")
        final Boolean truncated,
        @JsonProperty("user")
        final User user,
        @JsonProperty("withheld_copyright")
        final Boolean withheld_copyright,
        @JsonProperty("withheld_in_countries")
        final List<String> withheld_in_countries,
        @JsonProperty("withheld_scope")
        final String withheld_scope
    ) {
        this.coordinates = coordinates;
        this.created_at = created_at;
        this.current_user_retweet = current_user_retweet;
        this.entities = entities;
        this.extended_entities = extended_entities;
        this.favorite_count = favorite_count;
        this.favorited = favorited;
        this.filter_level = filter_level;
        this.geo = geo;
        this.id = id;
        this.in_reply_to_screen_name = in_reply_to_screen_name;
        this.in_reply_to_status_id = in_reply_to_status_id;
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        this.in_reply_to_user_id = in_reply_to_user_id;
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        this.is_quote_status = is_quote_status;
        this.id_str = id_str;
        this.lang = lang;
        this.matching_rules = matching_rules;
        this.place = place;
        this.possibly_sensitive = possibly_sensitive;
        this.quote_count = quote_count;
        this.quoted_status = quoted_status;
        this.quoted_status_id = quoted_status_id;
        this.quoted_status_id_str = quoted_status_id_str;
        this.reply_count = reply_count;
        this.retweet_count = retweet_count;
        this.retweeted = retweeted;
        this.retweeted_status = retweeted_status;
        this.scopes = scopes;
        this.source = source;
        this.text = text;
        this.truncated = truncated;
        this.user = user;
        this.withheld_copyright = withheld_copyright;
        this.withheld_in_countries = withheld_in_countries;
        this.withheld_scope = withheld_scope;
    }

    /**
     * Returns the <code>coordinates</code> property value from the {@link #coordinates} field.
     */
    public Map<String,?> getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the <code>coordinates</code> property value to <code>coordinates</code>.
     *
     * @param coordinates The new value for the <code>coordinates</code> property.
     */
    public void setCoordinates(final Map<String,?> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Returns the <code>created_at</code> property value from the {@link #created_at} field.
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * Sets the <code>created_at</code> property value to <code>created_at</code>.
     *
     * @param created_at The new value for the <code>created_at</code> property.
     */
    public void setCreated_at(final String created_at) {
        this.created_at = created_at;
    }

    /**
     * Returns the <code>current_user_retweet</code> property value from the {@link #current_user_retweet} field.
     */
    public Map<String,?> getCurrent_user_retweet() {
        return current_user_retweet;
    }

    /**
     * Sets the <code>current_user_retweet</code> property value to <code>current_user_retweet</code>.
     *
     * @param current_user_retweet The new value for the <code>current_user_retweet</code> property.
     */
    public void setCurrent_user_retweet(final Map<String,?> current_user_retweet) {
        this.current_user_retweet = current_user_retweet;
    }

    /**
     * Returns the <code>entities</code> property value from the {@link #entities} field.
     */
    public Map<String,?> getEntities() {
        return entities;
    }

    /**
     * Sets the <code>entities</code> property value to <code>entities</code>.
     *
     * @param entities The new value for the <code>entities</code> property.
     */
    public void setEntities(final Map<String,?> entities) {
        this.entities = entities;
    }

    /**
     * Returns the <code>extended_entities</code> property value from the {@link #extended_entities} field.
     */
    public Map<String,?> getExtended_entities() {
        return extended_entities;
    }

    /**
     * Sets the <code>extended_entities</code> property value to <code>extended_entities</code>.
     *
     * @param extended_entities The new value for the <code>extended_entities</code> property.
     */
    public void setExtended_entities(final Map<String,?> extended_entities) {
        this.extended_entities = extended_entities;
    }

    /**
     * Returns the <code>favorite_count</code> property value from the {@link #favorite_count} field.
     */
    public Integer getFavorite_count() {
        return favorite_count;
    }

    /**
     * Sets the <code>favorite_count</code> property value to <code>favorite_count</code>.
     *
     * @param favorite_count The new value for the <code>favorite_count</code> property.
     */
    public void setFavorite_count(final Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    /**
     * Returns the <code>favorited</code> property value from the {@link #favorited} field.
     */
    public Boolean isFavorited() {
        return favorited;
    }

    /**
     * Sets the <code>favorited</code> property value to <code>favorited</code>.
     *
     * @param favorited The new value for the <code>favorited</code> property.
     */
    public void setFavorited(final Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * Returns the <code>filter_level</code> property value from the {@link #filter_level} field.
     */
    public String getFilter_level() {
        return filter_level;
    }

    /**
     * Sets the <code>filter_level</code> property value to <code>filter_level</code>.
     *
     * @param filter_level The new value for the <code>filter_level</code> property.
     */
    public void setFilter_level(final String filter_level) {
        this.filter_level = filter_level;
    }

    /**
     * Returns the <code>geo</code> property value from the {@link #geo} field.
     */
    public Map<String,?> getGeo() {
        return geo;
    }

    /**
     * Sets the <code>geo</code> property value to <code>geo</code>.
     *
     * @param geo The new value for the <code>geo</code> property.
     */
    public void setGeo(final Map<String,?> geo) {
        this.geo = geo;
    }

    /**
     * Returns the <code>id</code> property value from the {@link #id} field.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the <code>id</code> property value to <code>id</code>.
     *
     * @param id The new value for the <code>id</code> property.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Returns the <code>in_reply_to_screen_name</code> property value from the {@link #in_reply_to_screen_name} field.
     */
    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    /**
     * Sets the <code>in_reply_to_screen_name</code> property value to <code>in_reply_to_screen_name</code>.
     *
     * @param in_reply_to_screen_name The new value for the <code>in_reply_to_screen_name</code> property.
     */
    public void setIn_reply_to_screen_name(final String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    /**
     * Returns the <code>in_reply_to_status_id</code> property value from the {@link #in_reply_to_status_id} field.
     */
    public Long getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    /**
     * Sets the <code>in_reply_to_status_id</code> property value to <code>in_reply_to_status_id</code>.
     *
     * @param in_reply_to_status_id The new value for the <code>in_reply_to_status_id</code> property.
     */
    public void setIn_reply_to_status_id(final Long in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    /**
     * Returns the <code>in_reply_to_status_id_str</code> property value from the {@link #in_reply_to_status_id_str} field.
     */
    public String getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    /**
     * Sets the <code>in_reply_to_status_id_str</code> property value to <code>in_reply_to_status_id_str</code>.
     *
     * @param in_reply_to_status_id_str The new value for the <code>in_reply_to_status_id_str</code> property.
     */
    public void setIn_reply_to_status_id_str(final String in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    /**
     * Returns the <code>in_reply_to_user_id</code> property value from the {@link #in_reply_to_user_id} field.
     */
    public Long getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    /**
     * Sets the <code>in_reply_to_user_id</code> property value to <code>in_reply_to_user_id</code>.
     *
     * @param in_reply_to_user_id The new value for the <code>in_reply_to_user_id</code> property.
     */
    public void setIn_reply_to_user_id(final Long in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    /**
     * Returns the <code>in_reply_to_user_id_str</code> property value from the {@link #in_reply_to_user_id_str} field.
     */
    public String getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    /**
     * Sets the <code>in_reply_to_user_id_str</code> property value to <code>in_reply_to_user_id_str</code>.
     *
     * @param in_reply_to_user_id_str The new value for the <code>in_reply_to_user_id_str</code> property.
     */
    public void setIn_reply_to_user_id_str(final String in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    /**
     * Returns the <code>is_quote_status</code> property value from the {@link #is_quote_status} field.
     */
    public Boolean is_quote_status() {
        return is_quote_status;
    }

    /**
     * Sets the <code>is_quote_status</code> property value to <code>is_quote_status</code>.
     *
     * @param is_quote_status The new value for the <code>is_quote_status</code> property.
     */
    public void setIs_quote_status(final Boolean is_quote_status) {
        this.is_quote_status = is_quote_status;
    }

    /**
     * Returns the <code>id_str</code> property value from the {@link #id_str} field.
     */
    public String getId_str() {
        return id_str;
    }

    /**
     * Sets the <code>id_str</code> property value to <code>id_str</code>.
     *
     * @param id_str The new value for the <code>id_str</code> property.
     */
    public void setId_str(final String id_str) {
        this.id_str = id_str;
    }

    /**
     * Returns the <code>lang</code> property value from the {@link #lang} field.
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the <code>lang</code> property value to <code>lang</code>.
     *
     * @param lang The new value for the <code>lang</code> property.
     */
    public void setLang(final String lang) {
        this.lang = lang;
    }

    /**
     * Returns the <code>matching_rules</code> property value from the {@link #matching_rules} field.
     */
    public List<Map<String,?>> getMatching_rules() {
        return matching_rules;
    }

    /**
     * Sets the <code>matching_rules</code> property value to <code>matching_rules</code>.
     *
     * @param matching_rules The new value for the <code>matching_rules</code> property.
     */
    public void setMatching_rules(final List<Map<String,?>> matching_rules) {
        this.matching_rules = matching_rules;
    }

    /**
     * Returns the <code>place</code> property value from the {@link #place} field.
     */
    public Map<String,?> getPlace() {
        return place;
    }

    /**
     * Sets the <code>place</code> property value to <code>place</code>.
     *
     * @param place The new value for the <code>place</code> property.
     */
    public void setPlace(final Map<String,?> place) {
        this.place = place;
    }

    /**
     * Returns the <code>possibly_sensitive</code> property value from the {@link #possibly_sensitive} field.
     */
    public Boolean isPossibly_sensitive() {
        return possibly_sensitive;
    }

    /**
     * Sets the <code>possibly_sensitive</code> property value to <code>possibly_sensitive</code>.
     *
     * @param possibly_sensitive The new value for the <code>possibly_sensitive</code> property.
     */
    public void setPossibly_sensitive(final Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    /**
     * Returns the <code>quote_count</code> property value from the {@link #quote_count} field.
     */
    public Integer getQuote_count() {
        return quote_count;
    }

    /**
     * Sets the <code>quote_count</code> property value to <code>quote_count</code>.
     *
     * @param quote_count The new value for the <code>quote_count</code> property.
     */
    public void setQuote_count(final Integer quote_count) {
        this.quote_count = quote_count;
    }

    /**
     * Returns the <code>quoted_status</code> property value from the {@link #quoted_status} field.
     */
    public Tweet getQuoted_status() {
        return quoted_status;
    }

    /**
     * Sets the <code>quoted_status</code> property value to <code>quoted_status</code>.
     *
     * @param quoted_status The new value for the <code>quoted_status</code> property.
     */
    public void setQuoted_status(final Tweet quoted_status) {
        this.quoted_status = quoted_status;
    }

    /**
     * Returns the <code>quoted_status_id</code> property value from the {@link #quoted_status_id} field.
     */
    public Long getQuoted_status_id() {
        return quoted_status_id;
    }

    /**
     * Sets the <code>quoted_status_id</code> property value to <code>quoted_status_id</code>.
     *
     * @param quoted_status_id The new value for the <code>quoted_status_id</code> property.
     */
    public void setQuoted_status_id(final Long quoted_status_id) {
        this.quoted_status_id = quoted_status_id;
    }

    /**
     * Returns the <code>quoted_status_id_str</code> property value from the {@link #quoted_status_id_str} field.
     */
    public String getQuoted_status_id_str() {
        return quoted_status_id_str;
    }

    /**
     * Sets the <code>quoted_status_id_str</code> property value to <code>quoted_status_id_str</code>.
     *
     * @param quoted_status_id_str The new value for the <code>quoted_status_id_str</code> property.
     */
    public void setQuoted_status_id_str(final String quoted_status_id_str) {
        this.quoted_status_id_str = quoted_status_id_str;
    }

    /**
     * Returns the <code>reply_count</code> property value from the {@link #reply_count} field.
     */
    public Integer getReply_count() {
        return reply_count;
    }

    /**
     * Sets the <code>reply_count</code> property value to <code>reply_count</code>.
     *
     * @param reply_count The new value for the <code>reply_count</code> property.
     */
    public void setReply_count(final Integer reply_count) {
        this.reply_count = reply_count;
    }

    /**
     * Returns the <code>retweet_count</code> property value from the {@link #retweet_count} field.
     */
    public Integer getRetweet_count() {
        return retweet_count;
    }

    /**
     * Sets the <code>retweet_count</code> property value to <code>retweet_count</code>.
     *
     * @param retweet_count The new value for the <code>retweet_count</code> property.
     */
    public void setRetweet_count(final Integer retweet_count) {
        this.retweet_count = retweet_count;
    }

    /**
     * Returns the <code>retweeted</code> property value from the {@link #retweeted} field.
     */
    public Boolean isRetweeted() {
        return retweeted;
    }

    /**
     * Sets the <code>retweeted</code> property value to <code>retweeted</code>.
     *
     * @param retweeted The new value for the <code>retweeted</code> property.
     */
    public void setRetweeted(final Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * Returns the <code>retweeted_status</code> property value from the {@link #retweeted_status} field.
     */
    public Tweet getRetweeted_status() {
        return retweeted_status;
    }

    /**
     * Sets the <code>retweeted_status</code> property value to <code>retweeted_status</code>.
     *
     * @param retweeted_status The new value for the <code>retweeted_status</code> property.
     */
    public void setRetweeted_status(final Tweet retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    /**
     * Returns the <code>scopes</code> property value from the {@link #scopes} field.
     */
    public Map<String,?> getScopes() {
        return scopes;
    }

    /**
     * Sets the <code>scopes</code> property value to <code>scopes</code>.
     *
     * @param scopes The new value for the <code>scopes</code> property.
     */
    public void setScopes(final Map<String,?> scopes) {
        this.scopes = scopes;
    }

    /**
     * Returns the <code>source</code> property value from the {@link #source} field.
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the <code>source</code> property value to <code>source</code>.
     *
     * @param source The new value for the <code>source</code> property.
     */
    public void setSource(final String source) {
        this.source = source;
    }

    /**
     * Returns the <code>text</code> property value from the {@link #text} field.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the <code>text</code> property value to <code>text</code>.
     *
     * @param text The new value for the <code>text</code> property.
     */
    public void setText(final String text) {
        this.text = text;
    }

    /**
     * Returns the <code>truncated</code> property value from the {@link #truncated} field.
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * Sets the <code>truncated</code> property value to <code>truncated</code>.
     *
     * @param truncated The new value for the <code>truncated</code> property.
     */
    public void setTruncated(final Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * Returns the <code>user</code> property value from the {@link #user} field.
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the <code>user</code> property value to <code>user</code>.
     *
     * @param user The new value for the <code>user</code> property.
     */
    public void setUser(final User user) {
        this.user = user;
    }

    /**
     * Returns the <code>withheld_copyright</code> property value from the {@link #withheld_copyright} field.
     */
    public Boolean isWithheld_copyright() {
        return withheld_copyright;
    }

    /**
     * Sets the <code>withheld_copyright</code> property value to <code>withheld_copyright</code>.
     *
     * @param withheld_copyright The new value for the <code>withheld_copyright</code> property.
     */
    public void setWithheld_copyright(final Boolean withheld_copyright) {
        this.withheld_copyright = withheld_copyright;
    }

    /**
     * Returns the <code>withheld_in_countries</code> property value from the {@link #withheld_in_countries} field.
     */
    public List<String> getWithheld_in_countries() {
        return withheld_in_countries;
    }

    /**
     * Sets the <code>withheld_in_countries</code> property value to <code>withheld_in_countries</code>.
     *
     * @param withheld_in_countries The new value for the <code>withheld_in_countries</code> property.
     */
    public void setWithheld_in_countries(final List<String> withheld_in_countries) {
        this.withheld_in_countries = withheld_in_countries;
    }

    /**
     * Returns the <code>withheld_scope</code> property value from the {@link #withheld_scope} field.
     */
    public String getWithheld_scope() {
        return withheld_scope;
    }

    /**
     * Sets the <code>withheld_scope</code> property value to <code>withheld_scope</code>.
     *
     * @param withheld_scope The new value for the <code>withheld_scope</code> property.
     */
    public void setWithheld_scope(final String withheld_scope) {
        this.withheld_scope = withheld_scope;
    }
}
