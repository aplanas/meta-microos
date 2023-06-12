SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "telepathy-mission-control-5.16.6-1.9.aarch64.rpm"
RPM_HASH = "a69d0ace9ee879b4ef927c1739a075686f4f47ee46f1dd7cd966c7fe7b36788726187123e726f54c4cdcd695e6dbd6241f54a02780f424ba49110a876fefb105"

RPROVIDES:${PN} += "telepathy-mission-control \
telepathy-mission-control(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmission-control-plugins.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.11)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.4)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.12)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.16)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.20)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.30)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.31)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.32)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.34)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.35)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.36)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.37)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.2)(64bit)"

inherit rpm
