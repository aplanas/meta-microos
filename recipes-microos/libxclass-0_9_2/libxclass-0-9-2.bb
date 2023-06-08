SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "libxclass-0_9_2-0.9.2-188.6.aarch64.rpm"
RPM_HASH = "1adabd601059a59969c5b633fd10cd8b69f95f9c60f05eb3c0e7151d7a1899ee1dda13a6f495de5f744dc4fa770f49c771a4381896ba6ac9257fb0523a93c055"

RPROVIDES:${PN} += "libxclass-0_9_2 libxclass-0_9_2(aarch-64) libxclass.so.0.9.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXpm.so.4()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) xclass"

inherit rpm
