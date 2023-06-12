SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.7.3"

RPM_NAME = "python310-googlemaps-4.7.3-1.3.noarch.rpm"
RPM_HASH = "d314c6d87089f68d6cc098cd87d706513231de4a9cd25ba1b86dac6a606118bb078e0176d44c28f7bc6057eccb867b26393d637c27d772f8f8e68424d88412da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googlemaps \
python3.10dist(googlemaps) \
python310-googlemaps \
python3dist(googlemaps)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
