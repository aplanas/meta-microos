SUMMARY = "MATE Weather shared libraries"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmateweather1-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "ff60df5f1a99e49ed7b92708ec3262f89b030526b1ca29a1b4a733813ca52e36e4f399efc13c001b742b7ccaaad0ab61af21721c5d5f9aa68ca0cefb1fb8fe9d"

RPROVIDES:${PN} += "libmateweather libmateweather.so.1()(64bit) libmateweather1 libmateweather1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsoup-2.4.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.21)(64bit) mateweather-common"

inherit rpm
