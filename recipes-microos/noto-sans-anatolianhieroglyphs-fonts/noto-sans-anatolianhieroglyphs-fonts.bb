SUMMARY = "Noto Anatolian Hieroglyphs Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
AnatolianHieroglyphs Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-anatolianhieroglyphs-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "55aa8089e66c1fd9d3a50f8ccb0c0bd6b2fa7148442d8b1130b81c687c64eba5e2aa145ea6c15087397f0ba1d84826bd3b5869f5a6a0528f2ac33c25534ebfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-anatolianhieroglyphs \
noto-sans-anatolianhieroglyphs-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
