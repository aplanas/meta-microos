SUMMARY = "Private library for Budgie"
DESCRIPTION = "Private library for Budgie desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libbudgie-private0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "b6569f67b3eee43bc94ea5dfc324ddb7a8fb6fec6bbacf7431d8e897540c7baa345307bf06af13f7ca7981ed8901c3c4bc93b904cf8c634aac0d014130aaf45e"

RPROVIDES:${PN} += "libbudgie-private.so.0()(64bit) libbudgie-private0 libbudgie-private0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
