SUMMARY = "Shared library for Flash hardware identification"
DESCRIPTION = "The Flash plugin currently requires libhal for playback of drm content. \
 \
This library provides a compatibility layer and minimal libhal implementation for that purpose. \
This library does NOT provide a full HAL interface or daemon."
LICENSE = "GPL-2.0+ | AFL-2.1"

PV = "0.3.3"

RPM_NAME = "libhal1-0.3.3-1.26.aarch64.rpm"
RPM_HASH = "5e2c35a52d692116926fa43569fe935a4bb88b3ce300cff3c89f28f1a5a5ae20fab4038abd2e86439a5b29261737940b1ac32beb43015540a41ed9382a0c837b"

RPROVIDES:${PN} += "hal-flash \
libhal.so.1()(64bit) \
libhal1 \
libhal1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
