SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libedataserverui-1_2-4-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "64514a78bde0ba0ad0b57549f4409cf3b065a9fa70e83f76d9650468e7427cd7317c8a0ccbb18d65b470d49ecb731e507561577142f27a302cd542b847b5443c"

RPROVIDES:${PN} += "libedataserverui-1.2.so.4()(64bit) libedataserverui-1_2-4 libedataserverui-1_2-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libcamel-1.2.so.64()(64bit) libecal-2.0.so.2()(64bit) libedataserver-1.2.so.27()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libical-glib.so.3()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.7)(64bit) libnss3.so(NSS_3.9.2)(64bit) libpango-1.0.so.0()(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.4)(64bit) libsoup-3.0.so.0()(64bit) libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
