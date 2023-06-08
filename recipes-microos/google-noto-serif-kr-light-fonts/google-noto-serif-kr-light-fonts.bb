SUMMARY = "Noto Serif Korean Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Light weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-light-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "c3c395f33b41bce6d1d170596fa03911dd78c332a435b5341c185a2aa9af1b2de0a213d545a1875adffdab9cd9881107c9b2b1a817ee0af6d4160a92bb492183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-light-fonts noto-serif-kr-light-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
