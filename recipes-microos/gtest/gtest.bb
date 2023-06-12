SUMMARY = "Development files for the Google C++ Testing Framework"
DESCRIPTION = "Google's framework for writing C++ tests on a variety of platforms \
(Linux, Mac OS X, Windows, Cygwin, Windows CE, and Symbian). \
Based on the xUnit architecture. Supports automatic test discovery, \
a rich set of assertions, user-defined assertions, death tests, \
fatal and non-fatal failures, value- and type-parameterized tests, \
various options for running the tests, and XML test report generation. \
 \
This package provides shared libraries and header files for development \
with googletest."
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "gtest-1.12.1-1.3.aarch64.rpm"
RPM_HASH = "0e02f34cf3eaee06c98b1af83fd6da1bb8c49d37911475e939ce9ad3c6cbfba0d28c54499248498b489a2e8f8f545efaf673f563ac168850aee3d808b75d9844"

RPROVIDES:${PN} += "googletest-devel \
gtest \
gtest(aarch-64) \
libgtest.so.1.12.1()(64bit) \
libgtest_main.so.1.12.1()(64bit) \
pkgconfig(gtest) \
pkgconfig(gtest_main)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
