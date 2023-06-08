SUMMARY = "Evolution Data Server's Backend Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libebackend-1_2-11-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "08db12d7553b877285381c5ab23cae057f97a15ec9668097d3a25aa67af87d54ad5eaa91334f28c47e9c114afc600847a03fe2b7ee0e0145ebf0ad44e19accd7"

RPROVIDES:${PN} += "libebackend-1.2.so.11()(64bit) libebackend-1_2-11 libebackend-1_2-11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libdb-4.8.so()(64bit) libedataserver-1.2.so.27()(64bit) libedbus-private.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
