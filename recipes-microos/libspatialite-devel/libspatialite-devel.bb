SUMMARY = "Development files for libspatialite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libspatialite."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "libspatialite-devel-5.0.1-2.10.aarch64.rpm"
RPM_HASH = "cc5af8647e5872f5383eac108927cf5c4fe2a7ea134fc4fb5ad5554264f8f2e113fffc7392ab8f2ef7bf06fbccee13fb1c9213937534dcd5fefb7fbac5046a4d"

RPROVIDES:${PN} += "libspatialite-devel libspatialite-devel(aarch-64) pkgconfig(spatialite)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libspatialite7"

inherit rpm
