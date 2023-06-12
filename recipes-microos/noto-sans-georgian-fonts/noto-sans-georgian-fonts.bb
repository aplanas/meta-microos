SUMMARY = "Noto Georgian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-georgian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e3a75f6ddc501d01062d0f01339e2d8d7d332aed97e6310150779269109ec623de19f404bbbeb988604e61c726870ac8f2a93f12b900ee432a4713d129abc4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-georgian \
noto-sans-georgian-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
