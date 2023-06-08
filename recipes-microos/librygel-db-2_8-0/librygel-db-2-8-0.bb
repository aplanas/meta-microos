SUMMARY = "Database library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the database library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-db-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "5434cbf9d1970060e3628ed66560637169fc730678d36c3b035557b81eb63b781e06829e1fda79a74c1ad62dc0cfcbfe73d1a9cc823f6d363e750ad6f0d2c7ba"

RPROVIDES:${PN} += "librygel-db-2.8.so.0()(64bit) librygel-db-2_8-0 librygel-db-2_8-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) librygel-core-2.8.so.0()(64bit) libsqlite3.so.0()(64bit) libunistring.so.5()(64bit)"

inherit rpm
