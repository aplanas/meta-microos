SUMMARY = "Library for fingerprint reader support"
DESCRIPTION = "The fprint project provides a central system to support fingerprint \
readers. libfprint is the component which does the work of talking to \
fingerprint reading devices, and processing fingerprint data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-2-2-1.94.5+tod1-1.3.aarch64.rpm"
RPM_HASH = "c87092b2577e833fe11682352c0591568bd0372cbb4bb46dfc1daed03f9cba5bfe540a2ab0846fa82cd3f2838ed94fe39b6a9fa375781be673d56096bd2ca7a7"

RPROVIDES:${PN} += "libfprint \
libfprint-2-2 \
libfprint-2-2(aarch-64) \
libfprint-2.so.2()(64bit) \
libfprint-2.so.2(LIBFPRINT_2.0.0)(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libgusb.so.2()(64bit) \
libgusb.so.2(LIBGUSB_0.1.0)(64bit) \
libgusb.so.2(LIBGUSB_0.2.2)(64bit) \
libgusb.so.2(LIBGUSB_0.2.4)(64bit) \
libgusb.so.2(LIBGUSB_0.2.8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libpixman-1.so.0()(64bit)"

inherit rpm
