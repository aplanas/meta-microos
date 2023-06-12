SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libsodium."
LICENSE = "ISC"

PV = "1.0.18"

RPM_NAME = "libsodium-devel-1.0.18-2.14.aarch64.rpm"
RPM_HASH = "959ab2d6208ec8bea8295d998375397a018a659e2d3242e5eebf1edb203a77c45fc18bb1506b7f2d8cae5b98f5bdcede9be5bbc83fa695b227845d416be48972"

RPROVIDES:${PN} += "libsodium-devel \
libsodium-devel(aarch-64) \
pkgconfig(libsodium)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsodium23"

inherit rpm
