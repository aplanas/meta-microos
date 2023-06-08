SUMMARY = "OpenCASCADE modeling data libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE modeling module: \
  TKG2d TKG3d TKGeomBase TKBRep"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-modelingdata7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "c9bd2643cec41d6777714317f26fa66f8785dcec7b041e129f2f2a84809cddf3cc6930108c3f1d66bbd4547e289b1a12d799160e249d111466ee3f143b086819"

RPROVIDES:${PN} += "libTKBRep.so.7.7()(64bit) libTKG2d.so.7.7()(64bit) libTKG3d.so.7.7()(64bit) libTKGeomBase.so.7.7()(64bit) libopencascade-modelingdata7_7 libopencascade-modelingdata7_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libTKMath.so.7.7()(64bit) libTKernel.so.7.7()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
