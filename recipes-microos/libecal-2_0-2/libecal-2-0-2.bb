SUMMARY = "Evolution Data Server's Calendar Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access calendars."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libecal-2_0-2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "450e1d6456d73e5dd7a22598c493ce38edcbf41fd0f41b46b2020ef9202e8ced71c3bbd0baed5a5b1dc862d260dfc974e9a3bf204c595dd01d6df8788b00589d"

RPROVIDES:${PN} += "libecal-2.0.so.2()(64bit) libecal-2_0-2 libecal-2_0-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) libedbus-private.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libical-glib.so.3()(64bit) libical.so.3()(64bit)"

inherit rpm
