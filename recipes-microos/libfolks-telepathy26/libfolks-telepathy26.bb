SUMMARY = "Telepathy backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks-telepathy26-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "cbf6d36034539e9e267e17e661967fe8ed550c3887370b0640bd612e7dbbd7a1deb0b3855dc33de095d0f3ed0bb90a8a465efcfb11a90f418c9f059ceb0041c3"

RPROVIDES:${PN} += "libfolks-telepathy.so.26()(64bit) libfolks-telepathy26 libfolks-telepathy26(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.6)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.7)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.1)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.14)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.3)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.3)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.32)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit)"

inherit rpm
