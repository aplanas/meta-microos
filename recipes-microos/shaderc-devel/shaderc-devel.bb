SUMMARY = "Header files for the shaderc library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.2"

RPM_NAME = "shaderc-devel-2023.2-1.2.aarch64.rpm"
RPM_HASH = "054d7027253989535e1dcc8e760521fef2f7c96b4d5eb08d6ecbc19bde292c20b005036bbfc81542eb61af6cd12bc2e983a81d72d82aa6d591508cc3fed05d6a"

RPROVIDES:${PN} += "pkgconfig(shaderc) shaderc-devel shaderc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libshaderc_shared1"

inherit rpm
