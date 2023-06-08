SUMMARY = "XA state tracker"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker2-1.0.0-349.1.aarch64.rpm"
RPM_HASH = "b38cb3ac07536d72b6c3c7a3caeb2e4d32b40f3946b4097215b98eeaa849104453faf1c595066b1602e69a70ee870a4e562439d81f0699222dc0d41fcd92a5ec"

RPROVIDES:${PN} += "libxatracker.so.2()(64bit) libxatracker2 libxatracker2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libdrm_nouveau.so.2()(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
