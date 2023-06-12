SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the Valgrind header files."
LICENSE = "GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-devel-3.21.0-1.1.aarch64.rpm"
RPM_HASH = "584145f4fcaf7c3371c1b0c1d75314b217370903e3d0d0ff68b47c1348373eba38bee15629352bbdd9311debbcebec7e9cece901bb45610a0a2c5a3a8f37af6c"

RPROVIDES:${PN} += "pkgconfig(valgrind) valgrind-devel valgrind-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config valgrind valgrind-client-headers"

inherit rpm
