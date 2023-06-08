SUMMARY = "SPIR-V shader compiler library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.2"

RPM_NAME = "libshaderc_shared1-2023.2-1.2.aarch64.rpm"
RPM_HASH = "3adf67954a8d973e8c2c469ed3607140cd93b7a44e4dfd964366000ec4c328eea1177adc7016f2c57c28f44f6ac31065aa7089cee6d56947ca6147743e303185"

RPROVIDES:${PN} += "libshaderc_shared.so.1()(64bit) libshaderc_shared1 libshaderc_shared1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV-Tools-2023.2.so()(64bit) libSPIRV-Tools-opt-2023.2.so()(64bit) libSPIRV.so.12()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
