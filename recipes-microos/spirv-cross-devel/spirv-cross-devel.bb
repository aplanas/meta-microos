SUMMARY = "Development headers for the SPIRV-Cross library"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.243.0"

RPM_NAME = "spirv-cross-devel-1.3.243.0-1.1.aarch64.rpm"
RPM_HASH = "99a1ceb067607c5d40307df19daa1e4d2e2839a47894ca5a34baed5a06a5ee181beedd527e3067a3bb87f00c93ee674ec7b4a6603030aac5894722c71c7e8907"

RPROVIDES:${PN} += "libspirv-cross-c-shared-devel pkgconfig(spirv-cross-c-shared) spirv-cross-devel spirv-cross-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libspirv-cross-c-shared0"

inherit rpm
