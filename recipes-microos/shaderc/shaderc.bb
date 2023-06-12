SUMMARY = "A collection of tools, libraries and tests for shader compilation"
DESCRIPTION = "A collection of tools, libraries and tests for shader compilation. \
Included are: \
 \
* glslc, a command line compiler for GLSL/HLSL to SPIR-V, and \
* libshaderc, a library API for doing the same. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools."
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "shaderc-2023.4-1.1.aarch64.rpm"
RPM_HASH = "0cd2166ea9913d2d439a9efd749aa18ef1189dbf10c87cefcaa3392ec1f38adcba4a5f4878c7097651fa455e3622e67191d689d06c0a6495cad1a35639daf0f0"

RPROVIDES:${PN} += "shaderc \
shaderc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) \
libSPIRV.so.12()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglslang.so.12()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
