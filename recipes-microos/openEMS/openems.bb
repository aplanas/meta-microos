SUMMARY = "Electromagnetic field solver using the EC-FDTD method"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "dcbf9820644c442179d72e8ce85c851c6e7c7e6845fa55343a1a2f7efdf2dd9cd6562161cf889a8260e3479fadfb244b2efdeaa6fd70e0bc3c2fa7825eccba93"

RPROVIDES:${PN} += "openEMS \
openEMS(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnf2ff.so.0()(64bit) \
libopenEMS.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
