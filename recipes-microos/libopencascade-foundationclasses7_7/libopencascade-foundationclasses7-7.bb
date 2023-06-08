SUMMARY = "OpenCASCADE foundation classes libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE foundation classes module: \
  TKernel TKMath"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-foundationclasses7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "6b4fe6a6c242ee0d186fa3e32e76845a531a0630a4a90c0e8d004537d76b295a0352c6e53742aa21b848818bd21bca1e6d3ed3ce69738a9cb236704082cd2ae9"

RPROVIDES:${PN} += "libTKMath.so.7.7()(64bit) libTKernel.so.7.7()(64bit) libopencascade-foundationclasses7_7 libopencascade-foundationclasses7_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
