SUMMARY = "Library for parsing the MS Visio file format structure"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-0_1-1-0.1.7-1.26.aarch64.rpm"
RPM_HASH = "3618ede67f4c2c463d6f2e9aa49785a80f491a9975f0387176eb5053a2239e2059166b8ba913f4c6b8e5e3ac1511f6ba87c834e4e27088ca2d3f67c299c478db"

RPROVIDES:${PN} += "libvisio-0.1.so.1()(64bit) libvisio-0_1-1 libvisio-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
