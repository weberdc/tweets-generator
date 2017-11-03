package org.dcw.twitter.util;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.ParameterException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Converter for parsing geo-box commandline arguments, consisting of
 * four doubles, separated by commas, in the order:
 * <ol>
 *   <li>North West longitude (x),</li>
 *   <li>North West latitude (y),</li>
 *   <li>South East longitude (x),</li>
 *   <li>South East latitude (y).</li>
 * </ol>
 */
public class GeoboxConverter implements IStringConverter<List<Double>> {
    static final String FLOAT_REGEX = "[-+]?([0-9]*\\.[0-9]+|[0-9]+)";
    static final String GEOBOX_REGEX = String.format(
        "%s,%s,%s,%s", FLOAT_REGEX, FLOAT_REGEX, FLOAT_REGEX, FLOAT_REGEX
    );

    @Override
    public List<Double> convert(String value) {
        if (!value.matches(GEOBOX_REGEX)) {
            throw new ParameterException("Expected format: lat,lon,lat,lon");
        }
        return Stream.of(value.split(",")).map(Double::valueOf).collect(Collectors.toList());
    }
}
