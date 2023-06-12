SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which \
is used by MyPaint and other projects. This package provides the header \
files needed for developing applications using the gegl bindings for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl-devel-1.6.1-2.3.aarch64.rpm"
RPM_HASH = "8988c8b5a4f4c148849ab58e5390473682e20ae7300af8ae6f7c40e677d61f1dcd0dc7dc1c074790b3c9dd0788e46f221b08339304e016a9d4d30355bfb0816c"

RPROVIDES:${PN} += "libmypaint-gegl-devel \
libmypaint-gegl-devel(aarch-64) \
pkgconfig(libmypaint-gegl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmypaint-gegl0 \
libmypaint0 \
pkgconfig(gegl-0.4) \
pkgconfig(libmypaint)"

inherit rpm
