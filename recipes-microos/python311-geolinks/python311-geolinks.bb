SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-geolinks-0.2.0-1.14.noarch.rpm"
RPM_HASH = "246745cec9e914eee2c8f6adca044ac362a60a90086c2cf031ef48c8cacc242332049819e3467817ec75c2132b866a669e7b60fbe9fab747ae154d073c0e3c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geolinks) python311-geolinks python3dist(geolinks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
