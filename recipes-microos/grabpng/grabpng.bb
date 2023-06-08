SUMMARY = "Sprite position adjuster for PNG files"
DESCRIPTION = "grabpng allows to change the PNG 'GRAB' and 'ALPH' chunks used by \
ZDoom."
LICENSE = "GPL-3.0 & BSD-3-Clause"

PV = "20160630"

RPM_NAME = "grabpng-20160630-1.26.aarch64.rpm"
RPM_HASH = "968996e237362aac6f61c89188592c16633de5146a5c6ebc51166fbf4e0ef7e072372eb03316d4110dd4af79594e8e74b73e457b4d7dd251799f59718747a2bb"

RPROVIDES:${PN} += "grabpng grabpng(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
