SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "libmission-control-plugins0-5.16.6-1.9.aarch64.rpm"
RPM_HASH = "0a20cd9ad820f1c01d7757fc296071cd47bd8f7ad7296fab34151297a84a988ceecb764a60dc93f489737a5ac60d1ccbd29adb9d6079af65a7809ec3933ef4dd"

RPROVIDES:${PN} += "libmission-control-plugins.so.0()(64bit) \
libmission-control-plugins0 \
libmission-control-plugins0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit)"

inherit rpm
