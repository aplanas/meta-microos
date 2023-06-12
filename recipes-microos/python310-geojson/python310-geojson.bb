SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python310-geojson-2.5.0-1.8.noarch.rpm"
RPM_HASH = "f64125471143b31f7175c2c31eda0b7767445274bc507317c0e4ff2f40160c6559f3cff0fc947da2e5a7e66c720580b401a3b0cac3bf7d9462a2a58f09c41aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geojson \
python3.10dist(geojson) \
python310-geojson \
python3dist(geojson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
