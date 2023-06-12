SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-1.6.3-5.1.noarch.rpm"
RPM_HASH = "0eef00b6e0c393983a9ca225c17fdb2d801c4a5d1aae22bf719ab45ea8f35ded24e9a23e82272fa3285dce2f0f41cedf245b470d0fb9ee8af4425f27a88f54d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:pkgconf) \
mingw32(libpkgconf-3.dll) \
mingw32(pkg:libpkgconf) \
mingw32-pkg-config \
mingw32-pkgconf"
RDEPENDS:${PN} += ""

inherit rpm
