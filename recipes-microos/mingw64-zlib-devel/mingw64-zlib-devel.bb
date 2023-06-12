SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib-devel-1.2.13-2.1.noarch.rpm"
RPM_HASH = "ba3ba6d4544723cf261ca46941d7be8670bbbb6d7fd86f4f7f6a35d3fc700dbe01718e036458c01ab0dfb978ac1e3af22b7cc474c7e3ac2b905329ec70101dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(lib:z) \
mingw64(pkg:zlib) \
mingw64(pkg:zlib-static) \
mingw64-zlib-devel"
RDEPENDS:${PN} += "mingw64-libz"

inherit rpm
