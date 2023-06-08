SUMMARY = "Glade catalog for libhandy"
DESCRIPTION = "libhandy is a library to help with developing UI for mobile devices \
using GTK+/GNOME. \
 \
This package provides a catalog for libhandy, to allow the use \
libhandy widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "glade-catalog-libhandy-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "b8fb3147ddd2442861b039ed0f5ac5cfc1c19f6195cc2a42700525387c470254a84d043c3e4371ad2a33612c7b5ab92f097ba177711a3e233088af1c1a4340ff"

RPROVIDES:${PN} += "glade-catalog-libhandy glade-catalog-libhandy(aarch-64) libglade-handy-1.so()(64bit)"
RDEPENDS:${PN} += "glade ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgladeui-2.so.13()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
