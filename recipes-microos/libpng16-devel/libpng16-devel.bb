SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will manipulate PNG files using libpng16. \
 \
libpng is the official reference library for the Portable Network \
Graphics (PNG) format."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-devel-1.6.39-3.1.aarch64.rpm"
RPM_HASH = "a36bedcea4a9b66b4c8378986a6e804645d43fc01e2c7c522c1091dc979d0b38da195b48d0e69b198a278bf81823fa47e7c5f57ca12cef6a3d6662dbf7ecb92b"

RPROVIDES:${PN} += "libpng16-devel libpng16-devel(aarch-64) pkgconfig(libpng16)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel libpng16-16 pkgconfig pkgconfig(zlib)"

inherit rpm
