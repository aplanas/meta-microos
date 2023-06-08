SUMMARY = "Development headers for the SPIR-V tool library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2023.2"

RPM_NAME = "spirv-tools-devel-2023.2-1.1.aarch64.rpm"
RPM_HASH = "295f01f78de0e56b515779750642cf7196b1ab54374fa9bff3862be7b61a8b59c97ac1121922986611e77a08e0c259ffe7fbd269c6201fc84ab4871436830c42"

RPROVIDES:${PN} += "cmake(SPIRV-Tools) cmake(SPIRV-Tools-diff) cmake(SPIRV-Tools-link) cmake(SPIRV-Tools-lint) cmake(SPIRV-Tools-opt) cmake(SPIRV-Tools-reduce) cmake(SPIRV-Tools-tools) pkgconfig(SPIRV-Tools) pkgconfig(SPIRV-Tools-shared) spirv-tools-devel spirv-tools-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSPIRV-Tools-2023_2"

inherit rpm
