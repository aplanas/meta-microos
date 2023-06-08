SUMMARY = "Noto Tifinagh Hawad Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghHawad Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghhawad-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6041e2b5cda440204458d89e2f189b798dc22ee48383785fc278302aae2ea60e8f1d1597def99e40f813e1c9dc04b775c6d884857f5bfd84fbbe30053dc6b7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghhawad noto-sans-tifinaghhawad-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
