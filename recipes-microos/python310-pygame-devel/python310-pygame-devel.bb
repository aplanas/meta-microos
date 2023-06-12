SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python310-pygame-devel-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "83fa0e108c1f76e3d35d56644c59f9438a44ef9d9bf790b180cfc5de904e7b8e46768f56e0071accd895b5ef4509c14c79cf2c82ee0476ab7b0c1157c4dc3e0f"

RPROVIDES:${PN} += "python3-pygame-devel python310-pygame-devel python310-pygame-devel(aarch-64)"
RDEPENDS:${PN} += "python310-pygame"

inherit rpm
