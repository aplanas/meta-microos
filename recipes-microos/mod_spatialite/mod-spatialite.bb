SUMMARY = "Spatial SQLite extension"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "mod_spatialite-5.0.1-2.10.aarch64.rpm"
RPM_HASH = "53d087a9e18a6fc8fe23890f082aca6e3bbb9ac66e384520ca4440eee91e6745d817cb2ec4d27fec730db53adb896da5a2ef29897052deb9f8ee13fbdd157f22"

RPROVIDES:${PN} += "mod_spatialite \
mod_spatialite(aarch-64)"
RDEPENDS:${PN} += "libspatialite7"

inherit rpm
