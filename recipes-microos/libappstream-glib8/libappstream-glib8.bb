SUMMARY = "AppStream Abstraction Library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libappstream-glib8-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "2d1335016f427abfc798518c379a3d2bf550683d797a63052c182aafb2abd46cb1f98a5040b1388b65a944733e0e7e9a0480eb9397383518d07d84adb47f5e74"

RPROVIDES:${PN} += "libappstream-glib.so.8()(64bit) \
libappstream-glib8 \
libappstream-glib8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
librpmio.so.9()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
