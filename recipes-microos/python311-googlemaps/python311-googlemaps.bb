SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python311-googlemaps-4.7.3-1.3.noarch.rpm"
RPM_HASH = "e51a6ed0c8903c2343728c680cf407e920ebd35a3972b2f399b6cf1610970f51e74cfe0411ab98b7ea87aa3104ab0d894820a6bd97b7dc5b67f7fcf45bafc4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(googlemaps) python311-googlemaps python3dist(googlemaps)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
