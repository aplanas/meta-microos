SUMMARY = "API and commands for processing SPIR-V modules"
DESCRIPTION = "The package includes an assembler, binary module parser, \
disassembler, and validator for SPIR-V."
LICENSE = "Apache-2.0"

PV = "2023.3~rc1"

RPM_NAME = "spirv-tools-2023.3~rc1-1.1.aarch64.rpm"
RPM_HASH = "92c7a0072db2e1a60cb541fedc3c7e8af4a631beb8bc4c47c5628b2a903d001e4ee817fe60b8996c37c86c9dfe97af35c47464714c18ef448c135d79c3d6871d"

RPROVIDES:${PN} += "spirv-tools spirv-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV-Tools-2023.3~rc1.so()(64bit) libSPIRV-Tools-link-2023.3~rc1.so()(64bit) libSPIRV-Tools-lint-2023.3~rc1.so()(64bit) libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) libSPIRV-Tools-reduce-2023.3~rc1.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
