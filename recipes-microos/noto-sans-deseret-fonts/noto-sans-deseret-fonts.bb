SUMMARY = "Noto Deseret Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Deseret Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-deseret-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "09429725d742b46a1cef5ac03b6e4bc757c78e51d3be70ab7e212bb01e18a9c1aab3cfe3381d4890e9d52c812cd2bcb2198287c2162462da1c701425668a8512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-deseret noto-sans-deseret-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
