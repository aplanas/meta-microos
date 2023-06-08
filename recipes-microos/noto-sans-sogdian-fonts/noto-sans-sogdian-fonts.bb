SUMMARY = "Noto Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sogdian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "d1a6543e436ae11e73b9644419a03bf2fe37bed224fc609a6a9e400b62bc807d4c432b465cd06185073dd9a2148b9298ff5d31c9faa8ad1a56828efa4eebc519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sogdian noto-sans-sogdian-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
