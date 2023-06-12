SUMMARY = "PolicyKit Authorization Framework -- GObject Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the gobject library only."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "libpolkit-gobject-1-0-121-4.2.aarch64.rpm"
RPM_HASH = "324614982f9ac12854bda0384769955e3e93015e0049b34dbce9ae85ff533f16d801728d360b8adbe0cb469c9a2ef04086f86966cc90b12addd6746bd3c09f56"

RPROVIDES:${PN} += "libpolkit-gobject-1-0 \
libpolkit-gobject-1-0(aarch-64) \
libpolkit-gobject-1.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
polkit"

inherit rpm
