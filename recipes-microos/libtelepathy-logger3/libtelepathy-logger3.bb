SUMMARY = "Centralized Logging for the Telepathy Framework"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libtelepathy-logger3-0.8.2-7.9.aarch64.rpm"
RPM_HASH = "15b92fe20fb633c8363bc772b62fb7c8403afa4e43c9cfd705739f96cfc0395f392521c99fe89fa995dba5299f281477985c754a44f9b9e0aa030ca2dbb0fec7"

RPROVIDES:${PN} += "libtelepathy-logger.so.3()(64bit) libtelepathy-logger3 libtelepathy-logger3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-glib-1.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsqlite3.so.0()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.15)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.6)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.12)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.20)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.21)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.32)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.34)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.6)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.2)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
