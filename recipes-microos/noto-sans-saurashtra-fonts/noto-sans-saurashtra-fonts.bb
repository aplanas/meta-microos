SUMMARY = "Noto Saurashtra Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Saurashtra Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-saurashtra-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "585b8d3b781aac8267f64ba962eb2d162d4340316de3419cc85b03ad9a8370eaede86a2c6f918f5264248824438e550dc9c40344d5f51970db4232173702c0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-saurashtra noto-sans-saurashtra-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
