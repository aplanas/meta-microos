SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib-devel-1.2.13-3.1.noarch.rpm"
RPM_HASH = "73a821eac2199af30788346a25baec0d2f05d7b3fde0a5718727cc59689c5380fbd9ccb7c13cf70d5503d1b6eecd6d1512f704c5f27d3d0750a6f98fe695bd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:z) mingw32(pkg:zlib) mingw32(pkg:zlib-static) mingw32-zlib-devel"
RDEPENDS:${PN} += "mingw32-libz"

inherit rpm
