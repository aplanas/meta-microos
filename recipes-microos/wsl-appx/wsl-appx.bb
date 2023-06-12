SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.584.aarch64.rpm"
RPM_HASH = "1ae56bd8de827d4a6873fe82b831e28388a9ff5f0630afb7d84ad9a00696b19612892b30835354033a217945ba534186b49a7ecc90570fcdf480c2dea745ef8f"

RPROVIDES:${PN} += "wsl-appx wsl-appx(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
