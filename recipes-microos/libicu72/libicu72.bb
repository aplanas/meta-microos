SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the runtime libraries for ICU."
LICENSE = "ICU"

PV = "72.1"

RPM_NAME = "libicu72-72.1-2.3.aarch64.rpm"
RPM_HASH = "0be3c0cd9add5aab2e55e72e4d402150d079f4162e06c84f087b3732e49364da971fecaf0715d6b00c0af392325d1cb37ab463f19bdce9fb63a2c84f131108e1"

RPROVIDES:${PN} += "libicu libicu72 libicu72(aarch-64) libicudata.so.72()(64bit) libicui18n.so.72()(64bit) libicuio.so.72()(64bit) libicutest.so.72()(64bit) libicutu.so.72()(64bit) libicuuc.so.72()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicu72-ledata libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) timezone"

inherit rpm
