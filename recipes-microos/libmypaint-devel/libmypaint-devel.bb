SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects. \
This package provides the header needed for developing \
applications using libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-devel-1.6.1-2.3.aarch64.rpm"
RPM_HASH = "eefb0a9e195ed4f8f8f1b803a1d87cb6314bdb0462c2e3c94bd419d71e39ceb0e10c3c72deb0b1b0550485e0f247efe8317061b74d5aec64ee529fb0c4e37d0f"

RPROVIDES:${PN} += "libmypaint-devel libmypaint-devel(aarch-64) mypaint-devel pkgconfig(libmypaint)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmypaint0 pkgconfig(json-c)"

inherit rpm
