SUMMARY = "C++ API for the libcdio CD-ROM access library"
DESCRIPTION = "The libcdio package contains libraries for CD-ROM and CD image \
access. \
 \
This subpackage contains the C++ API library for cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libcdio++1-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "1dd77d954a613acfe10ea7f9db16cb16243b54e37a644f872f14f32fb4ecc69caa6469f1265dc4278b82e92886d4c6808cc3049c281e41860033628b7e1f3ea6"

RPROVIDES:${PN} += "libcdio++.so.1()(64bit) \
libcdio++1 \
libcdio++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
