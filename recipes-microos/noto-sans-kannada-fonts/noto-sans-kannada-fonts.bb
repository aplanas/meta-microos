SUMMARY = "Noto Kannada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kannada-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "66f1aa4c9c95462f38110f42c90a60eb6a55456c1b330bdadcbe64cb6cf1a6370b9977b252ab0a6009769f8f6aed7235260f879e4f6e8b7bcc9ec3f501d30844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kannada noto-sans-kannada-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
