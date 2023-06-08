SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libedataserverui4-1_0-0-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "242c5e2568265156ce540a559dbd0f856ded06994dbe3c0814a0670d8f39aefe0dc8d4a42bd242a80042b7b8036d645cc3a8b0fbdc7d35e80f617081af2ad7c6"

RPROVIDES:${PN} += "libedataserverui4-1.0.so.0()(64bit) libedataserverui4-1_0-0 libedataserverui4-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libecal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libical-glib.so.3()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.7)(64bit) libnss3.so(NSS_3.9.2)(64bit) libpango-1.0.so.0()(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.4)(64bit) libsoup-3.0.so.0()(64bit) libwebkitgtk-6.0.so.4()(64bit)"

inherit rpm
