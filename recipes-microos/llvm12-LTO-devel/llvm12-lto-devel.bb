SUMMARY = "Link-time optimizer for LLVM (devel package)"
DESCRIPTION = "This package contains the link-time optimizer for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-LTO-devel-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "565dff2134dca123731442a485539d12a324d91b25a67e4e3b35f64a8468856dc7a53db323426ca00b2faa49dcfffc718339fb6dde60307d3494a6809447d956"

RPROVIDES:${PN} += "libLTO.so llvm12-LTO-devel llvm12-LTO-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libLTO12 llvm12-devel"

inherit rpm
