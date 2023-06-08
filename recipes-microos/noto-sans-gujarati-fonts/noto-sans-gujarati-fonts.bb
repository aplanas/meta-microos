SUMMARY = "Noto Gujarati Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gujarati-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3e3e747b7d780b9c223fc1049143edf07f0e05710cfa46815fe71f91402c3890bc62dd75468e456e3d8208ea15ba115657b1a621278df7179adf44879ae3ca47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gujarati noto-sans-gujarati-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
