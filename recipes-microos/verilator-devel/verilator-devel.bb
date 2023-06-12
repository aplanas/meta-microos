SUMMARY = "Verilator library header files"
DESCRIPTION = "Development files for Verilator, a compiling Verilog HDL simulator. \
It includes header files and a pkgconfig file."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-devel-4.228-1.3.noarch.rpm"
RPM_HASH = "069adb0f8c6eb737ac4820af887a70b382babcf01a735e22e4febd61cc3c583b4b112538093d117cc8ad07c0596ae4768b06a26398e600dcdb3a4d2245a45921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(verilator) \
verilator-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
verilator"

inherit rpm
