SUMMARY = "Development files for the IMA/EVM control utility library"
DESCRIPTION = "This package contains the header files and the utilities for ima-evm-utils."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "ima-evm-utils-devel-1.5-1.2.aarch64.rpm"
RPM_HASH = "e6d1375f4114bff026c31d04815a81d9cae3a3af2154fdfa5a2eca71f6a39d3d0f9fb369b6d719fc171f7a93005775d3850c28fdd946782637ee056be952a0b5"

RPROVIDES:${PN} += "ima-evm-utils-devel ima-evm-utils-devel(aarch-64)"
RDEPENDS:${PN} += "libimaevm4 openssl-devel"

inherit rpm
