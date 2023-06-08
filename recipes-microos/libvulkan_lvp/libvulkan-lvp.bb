SUMMARY = "Mesa vulkan driver for LVP"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_lvp-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "d448f93a9d9f0b24f6ac4a01aeb39f29beb3833069e9dcded9a90b8738272854634e3595c10e28a1a5ac8c36513c0e44d1cfa6e639d56f8e37018c1fc2424f24"

RPROVIDES:${PN} += "libvulkan_lvp libvulkan_lvp(aarch-64) libvulkan_lvp.so()(64bit)"
RDEPENDS:${PN} += "Mesa-vulkan-device-select ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libX11-xcb.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwayland-client.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-present.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit) libxshmfence.so.1()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
