SUMMARY = "Library for Lime Suite"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms and other tools for developing with LMS7-based hardware."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "libLimeSuite22_09-1-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "b55de91e33a2417212c82efb1973226fc2d62cf95d367c172ac26f8db856fcc83fd9d743fc02afad10d3badc6fe059527f46c663c276add6b5056ad096027835"

RPROVIDES:${PN} += "libLimeSuite.so.22.09-1()(64bit) libLimeSuite22_09-1 libLimeSuite22_09-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libusb-1.0.so.0()(64bit) limesuite-udev"

inherit rpm
