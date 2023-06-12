SUMMARY = "Library to communicate with JSON-RPC based peers"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libjsonrpc-glib-1_0-1-3.44.0-1.1.aarch64.rpm"
RPM_HASH = "22178cbb8236075254cbda23885d7eabec9dacf8a638961880619124dcbf3f15e932149ff6ac743693a3c9414833a9ec4edcef035c3fb93be094edd9afdb3060"

RPROVIDES:${PN} += "libjsonrpc-glib-1.0.so.1()(64bit) \
libjsonrpc-glib-1_0-1 \
libjsonrpc-glib-1_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit)"

inherit rpm
