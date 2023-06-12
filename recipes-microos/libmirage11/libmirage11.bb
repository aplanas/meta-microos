SUMMARY = "A CD-ROM image access library"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage11-3.2.6-1.8.aarch64.rpm"
RPM_HASH = "548d1150f996c3a2a98997e61ee530c1c1fda46b26d9f65be1e26595fc25bf4576eb1031b08ab077417329b649f0c0fc605bd37dbad1b6886b65c5d2a1b63d15"

RPROVIDES:${PN} += "libmirage.so.11()(64bit) \
libmirage11 \
libmirage11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmirage-3_2"

inherit rpm
