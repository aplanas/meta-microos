SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python311-pygame-devel-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "37d2693af699b7422cf784158d0bc115c8d20cf843cbc69c82355f6e47e0d76c57767739ae30ae7773a72390e50fa4d366713319fc59e7fe648a1e044b0d6f39"

RPROVIDES:${PN} += "python311-pygame-devel python311-pygame-devel(aarch-64)"
RDEPENDS:${PN} += "python311-pygame"

inherit rpm
