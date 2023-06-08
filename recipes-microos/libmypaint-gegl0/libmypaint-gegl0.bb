SUMMARY = "GEGL bindings for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which is \
used by MyPaint and other projects. This package provides the shared libraries \
for libmypaint's GEGL bindings."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl0-1.6.1-2.3.aarch64.rpm"
RPM_HASH = "ab9d23cc38c03804eb9c035027684fd666f332639b2bcfade50fba4bd71c9bacc546edcd9f85a9f136f20b9d6d3c6174ca1653b5b14bb0783d9ffc5cffc11978"

RPROVIDES:${PN} += "libmypaint-gegl.so.0()(64bit) libmypaint-gegl0 libmypaint-gegl0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgegl-0.4.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmypaint.so.0()(64bit)"

inherit rpm
