SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_nouveau-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "8f7b545c1ec36632c4482ad9093ace6a02232832ffefc543d88a265ac65f00698cf088a339a605d939544a0b75380a5b57ee5bfde4a0ebfb273fe48f0cf810e7"

RPROVIDES:${PN} += "libvdpau_gallium.so.1.0.0()(64bit) libvdpau_nouveau libvdpau_nouveau(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libX11-xcb.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libdrm_amdgpu.so.1()(64bit) libdrm_nouveau.so.2()(64bit) libdrm_radeon.so.1()(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxcb-dri2.so.0()(64bit) libxcb-dri3.so.0()(64bit) libxcb-present.so.0()(64bit) libxcb-sync.so.1()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit) libxshmfence.so.1()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
