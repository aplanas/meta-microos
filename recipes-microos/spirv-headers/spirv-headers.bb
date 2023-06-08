SUMMARY = "Machine-readable files from the SPIR-V registry"
DESCRIPTION = "This repository contains machine-readable files from the SPIR-V \
registry. This includes: \
 \
* Header files for various languages. \
* JSON files describing the grammar for the SPIR-V core instruction \
  set, and for the GLSL.std.450 extended instruction set. \
* The XML registry file."
LICENSE = "MIT"

PV = "1.6.1+sdk243"

RPM_NAME = "spirv-headers-1.6.1+sdk243-1.1.noarch.rpm"
RPM_HASH = "e6f86ba2599c3d69b5467c77070778fede18a8cfae30c2930611dacf55570f9b38c482fb60d6c53045898b8865722d83c648a21e8f2193672384a6f3c3e32f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(SPIRV-Headers) pkgconfig(SPIRV-Headers) spirv-headers"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
