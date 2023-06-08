SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "skelcd-installer-openSUSE-17.86-1.29.aarch64.rpm"
RPM_HASH = "9582b34e4f3547b760c00b3b9956ba77f4b861f56a3edaa31ef8b2c1758e8836ccfb7488f920c978c6331ed8c0448d09c280c8725f9ad9d1c8e68d157bc52f9e"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-openSUSE skelcd-installer-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
