SUMMARY = "Python Geocoding Toolbox"
DESCRIPTION = "Geopy can determine the coordinates of addresses, cities, countries, \
and landmarks using third-party geocoders and other data sources such \
as wikis. \
 \
Geopy currently includes support for six geocoders: Google Maps, Yahoo! Maps, Windows \
Local Live (Virtual Earth), geocoder.us, GeoNames, MediaWiki pages (with the GIS \
extension), and Semantic MediaWiki pages."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-geopy-2.2.0-2.3.noarch.rpm"
RPM_HASH = "87e5221024f4c524524fc915d4dcb71305f010655da48abde7c553371c8d47ee08baf983611d6fc2cd0fc9c0c0040059c68e85802afe7d0d6b990e24ca25f759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopy python3.10dist(geopy) python310-geopy python3dist(geopy)"
RDEPENDS:${PN} += "python(abi) python310-geographiclib"

inherit rpm
