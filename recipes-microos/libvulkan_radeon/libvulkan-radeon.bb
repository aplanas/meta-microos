SUMMARY = "Mesa vulkan driver for AMD GPU"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_radeon-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "38c4cdd327ead2bf5d270bb116e09da94dc9bf7a4878a2f720ef5c546e13bcdcf2ac51f0b2a618a440b275d76cf401253b3789f404bab183cdf0685ddbd6204e"

RPROVIDES:${PN} += "libvulkan_radeon libvulkan_radeon(aarch-64) libvulkan_radeon.so()(64bit)"
RDEPENDS:${PN} += "Mesa-vulkan-device-select ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libX11-xcb.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libdrm_amdgpu.so.1()(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwayland-client.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-present.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit) libxshmfence.so.1()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
