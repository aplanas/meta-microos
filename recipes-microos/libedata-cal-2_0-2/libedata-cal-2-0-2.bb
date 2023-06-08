SUMMARY = "Evolution Data Server's Calendar Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for calendar backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libedata-cal-2_0-2-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "e06268d9c569f7ac41b1f9ca44900af3da86bd7d216d86ba61831a7234ef058a35eadc4d965db1efca6316dd7af652bc358080eb3acbe4e449aca3ca04dce7f0"

RPROVIDES:${PN} += "libedata-cal-2.0.so.2()(64bit) libedata-cal-2_0-2 libedata-cal-2_0-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libebackend-1.2.so.11()(64bit) libecal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libedbus-private.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libical-glib.so.3()(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
