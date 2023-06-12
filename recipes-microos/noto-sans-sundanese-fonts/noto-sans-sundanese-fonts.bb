SUMMARY = "Noto Sundanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sundanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sundanese-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "7dc2aed576dd795961fb47421214e7b728a599b776d27299b122541c163d72ff6bf1ddadd9db101aad5618817362952dcbff37e1297c04a39a269425e22e1fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sundanese \
noto-sans-sundanese-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
