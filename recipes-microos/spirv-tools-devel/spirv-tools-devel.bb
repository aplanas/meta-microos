SUMMARY = "Development headers for the SPIR-V tool library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2023.3~rc1"

RPM_NAME = "spirv-tools-devel-2023.3~rc1-1.1.aarch64.rpm"
RPM_HASH = "98a0825f9ceee904ccf1312b79f16a5eb378a67a0b81977dd7f571b129fb28ac8f0b6605b1e9796a760cc80088007c35e1eaeabbc92a888dbaf62448d61cf07b"

RPROVIDES:${PN} += "cmake(SPIRV-Tools) cmake(SPIRV-Tools-diff) cmake(SPIRV-Tools-link) cmake(SPIRV-Tools-lint) cmake(SPIRV-Tools-opt) cmake(SPIRV-Tools-reduce) cmake(SPIRV-Tools-tools) pkgconfig(SPIRV-Tools) pkgconfig(SPIRV-Tools-shared) spirv-tools-devel spirv-tools-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSPIRV-Tools-2023_3_rc1"

inherit rpm
