SUMMARY = "Python geodesic routines"
DESCRIPTION = "This is a Python implementation of the geodesic routines from GeographicLib. \
 \
This contains implementations of the classes Math, Accumulator, Geodesic, \
GeodesicLine and PolygonArea."
LICENSE = "MIT"

PV = "1.50"

RPM_NAME = "python311-geographiclib-1.50-1.8.noarch.rpm"
RPM_HASH = "0536cdd4a819d8ed53cfd38188e310bfccb17977abda5b8ea29fb7fc40ee61e7d51fffd08f826a9c39a10410b55ecbe13c0de5bfa3b5d1867159bf2d2ba1ccc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geographiclib) python311-geographiclib python3dist(geographiclib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
