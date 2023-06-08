SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-1.6.3-5.1.noarch.rpm"
RPM_HASH = "3d494fa96673e35c336a15103b9387edd73835e42729580a13b5f1999936012b07b0c20e86820e772b76c1004126aca14843288acc797369e4174b60ecfe1b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(lib:pkgconf) mingw64(libpkgconf-3.dll) mingw64(pkg:libpkgconf) mingw64-pkg-config mingw64-pkgconf"
RDEPENDS:${PN} += ""

inherit rpm
