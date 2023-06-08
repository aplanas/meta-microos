SUMMARY = "OpenGL and OpenGL ES shader front end implementation"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages."
LICENSE = "BSD-3-Clause"

PV = "12.1.0"

RPM_NAME = "libglslang12-12.1.0-2.1.aarch64.rpm"
RPM_HASH = "9ce908ccdfc17806f5d252561b32942a0ed632d902d249de4085642e31df2b150180f642a40d213bcb2e9aac7e8ded4758dd394f54e3f12036fd442d2b8c83fb"

RPROVIDES:${PN} += "libHLSL.so.12()(64bit) libSPIRV.so.12()(64bit) libSPVRemapper.so.12()(64bit) libglslang-default-resource-limits.so.12()(64bit) libglslang.so.12()(64bit) libglslang12 libglslang12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
