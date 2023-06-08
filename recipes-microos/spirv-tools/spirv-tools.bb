SUMMARY = "API and commands for processing SPIR-V modules"
DESCRIPTION = "The package includes an assembler, binary module parser, \
disassembler, and validator for SPIR-V."
LICENSE = "Apache-2.0"

PV = "2023.2"

RPM_NAME = "spirv-tools-2023.2-1.1.aarch64.rpm"
RPM_HASH = "e51dc49dce1bbe8d1f63b5b9ad16421f3b4e7b4a190d0d3d1384cb44d2afaea3d5e57374c95e6c7dc3a6c09eb628bcdd96910ad9a01f2ca70e02b6c11b55a626"

RPROVIDES:${PN} += "spirv-tools spirv-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV-Tools-2023.2.so()(64bit) libSPIRV-Tools-link-2023.2.so()(64bit) libSPIRV-Tools-lint-2023.2.so()(64bit) libSPIRV-Tools-opt-2023.2.so()(64bit) libSPIRV-Tools-reduce-2023.2.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
