SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python310-pygame-devel-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "4e55b3fcdf631b11f38d4621fc3fa9e9ec77b633221fa6d67397bb21f6ed5155bc9bd458388cd2a58394c1120c16ff50c3773556b8cda3c0275973d6b8e10bce"

RPROVIDES:${PN} += "python3-pygame-devel python310-pygame-devel python310-pygame-devel(aarch-64)"
RDEPENDS:${PN} += "python310-pygame"

inherit rpm
