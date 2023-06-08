SUMMARY = "OpenGL and OpenGL ES shader front end and validator"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
spirv-remap is a utility to improve compression of SPIR-V binary \
files via entropy reduction, plus optional stripping of debug \
information and load/store optimization. It transforms SPIR-V to \
SPIR-V, remapping IDs. The resulting modules have an increased ID \
range (IDs are not as tightly packed around zero), but will compress \
better when multiple modules are compressed together, since \
compressor's dictionary can find better cross module commonality."
LICENSE = "BSD-3-Clause"

PV = "12.1.0"

RPM_NAME = "glslang-devel-12.1.0-2.1.aarch64.rpm"
RPM_HASH = "f80fecc068f2bf9623b0524e1c4b173cf63f896d26f0c96d300663bafd96c2ab9a26673ccd734096e36c163dbc02311e2fce75a1ce15c4089894e9495d2a818e"

RPROVIDES:${PN} += "cmake(glslang) glslang-devel glslang-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV.so.12()(64bit) libSPVRemapper.so.12()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglslang-default-resource-limits.so.12()(64bit) libglslang.so.12()(64bit) libglslang12 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
