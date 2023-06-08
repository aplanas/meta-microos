SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "libxml++-3_0-1-3.2.4-1.3.aarch64.rpm"
RPM_HASH = "745c7344ae5f81abcf0b8816997704df0e650f28a8e42ccf0ca47b8eed3b8f598f85baa5bb9b305191544c3a3d0bc6e4977cda8005ceef681b500c8f1847e146"

RPROVIDES:${PN} += "libxml++-3.0.so.1()(64bit) libxml++-3_0-1 libxml++-3_0-1(aarch-64) libxml++30"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglibmm-2.4.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.15)(64bit) libxml2.so.2(LIBXML2_2.6.2)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit)"

inherit rpm
