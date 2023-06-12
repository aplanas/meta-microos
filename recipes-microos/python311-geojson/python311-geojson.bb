SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python311-geojson-2.5.0-1.8.noarch.rpm"
RPM_HASH = "de47508a1a1badd23b94daf777f572e7ca6f1a03bc7ac8204386356762bcfdc3231db1dd1539196f74cca174b403fe9c668a8e8dd611866b16457d681ace5d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geojson) \
python311-geojson \
python3dist(geojson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
