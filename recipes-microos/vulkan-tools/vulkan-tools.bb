SUMMARY = "Diagnostic utilities for Vulkan"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the Khronos official Vulkan tools and utilities."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "vulkan-tools-1.3.250.0-1.1.aarch64.rpm"
RPM_HASH = "0bf36a02919db2aee4525ecedb6e8ffd76617c564159d722d6170e244fb9db92df665366bb6ef831166ce680a7ebe62563a566828bdc3d51685ed65c9e18961a"

RPROVIDES:${PN} += "vulkan vulkan-tools vulkan-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvulkan.so.1()(64bit) libwayland-client.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
