SUMMARY = "Performance tools for C++"
DESCRIPTION = "The gperftools-devel package contains static and debug libraries and header \
files for developing applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-devel-2.10-1.5.aarch64.rpm"
RPM_HASH = "7363387b24e159863ef74a3b335c8d8de00ead7eb774e82d5f0a2ae7c72247f65b1633d20df5114a436e84008500bd74f33387dd9e2c07b663edf296d887b54a"

RPROVIDES:${PN} += "google-perftools-devel gperftools-devel gperftools-devel(aarch-64) pkgconfig(libprofiler) pkgconfig(libtcmalloc) pkgconfig(libtcmalloc_debug) pkgconfig(libtcmalloc_minimal) pkgconfig(libtcmalloc_minimal_debug)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gperftools libprofiler0 libstdc++-devel libtcmalloc4 libtcmalloc_and_profiler4 libtcmalloc_debug4 libtcmalloc_minimal4 libtcmalloc_minimal_debug4"

inherit rpm
