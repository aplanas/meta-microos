SUMMARY = "Plugins for libindi"
DESCRIPTION = "This package contains plugins for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libindi-plugins-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "c18b2ce47abe1d63e5cbdf827c0d0650d8acbd7f5e68e8e86d6a98d3722d4187b2fd1eec4ad6d652da19c846497cfbb9ff855744a8e4bea608ca8f1ba4414e76"

RPROVIDES:${PN} += "libindi-plugins libindi-plugins(aarch-64) libindi_Nearest_MathPlugin.so()(64bit) libindi_SVD_MathPlugin.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXISF.so.0()(64bit) libboost_system.so.1.82.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcfitsio.so.10()(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libindidriver.so.2()(64bit) libjpeg.so.8()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnova-0.15.so.0()(64bit) libogg.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtheoradec.so.1()(64bit) libtheoraenc.so.1()(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
