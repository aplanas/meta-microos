SUMMARY = "Development files for spatialindex"
DESCRIPTION = "The spatialindex-devel package contains libraries and header files for \
developing applications that use spatialindex."
LICENSE = "MIT"

PV = "1.9.3"

RPM_NAME = "spatialindex-devel-1.9.3-2.9.aarch64.rpm"
RPM_HASH = "a584763af851bd083f936ac41fa2f726cb7da2e4424d95aad2ad25ae930e37f5e8c4b431e8b6a1fcfbcba2ff9120b2706d4f411aaf2db50a0d6dd41a99151cc7"

RPROVIDES:${PN} += "libspatialindex-devel \
pkgconfig(libspatialindex) \
spatialindex-devel \
spatialindex-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspatialindex6"

inherit rpm
