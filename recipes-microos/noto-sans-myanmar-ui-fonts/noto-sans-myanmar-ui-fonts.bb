SUMMARY = "Noto Myanmar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-myanmar-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3790891f2a412fb5290277f0baa70fb50e567e31b3e5fb06a3f7662ceb7ffd2cad0a75d945535ce8d67203f61bcd9ea02cddbb1740ef610ba85f41c9d751d4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-myanmar-ui noto-sans-myanmar-ui-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
