SUMMARY = "Noto Mende Kikakui Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MendeKikakui Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mendekikakui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "189b6ce7562767188ff510660b3d81a4ff2b1a0a4b7a8f277526680c082b7a81cacda8ade5aca339c3d21a78a40443dd077c5143e079526ee1db5b1916886d17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mendekikakui noto-sans-mendekikakui-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
