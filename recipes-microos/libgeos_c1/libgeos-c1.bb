SUMMARY = "C language interface for the GEOS library"
DESCRIPTION = "This subpackage contains a shared library providing a C linkage \
interface for the (C++) GEOS library."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "libgeos_c1-3.11.2-2.1.aarch64.rpm"
RPM_HASH = "0deb81afb648bc09af9f3303ce985091fd4ff00ee4040ca12dae01f9160836b9fcf689e3995cca64bd27f8c1f6a2d0bb3d26c354508fb23c56ddb8d050d1762f"

RPROVIDES:${PN} += "libgeos_c.so.1()(64bit) \
libgeos_c1 \
libgeos_c1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgeos.so.3.11.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
