SUMMARY = "Noto Elymaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elymaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-elymaic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "fc533131cc17e3c9dc3ba3721bf45d696701ea0aa8edb1927258d1feb131c420fe7745d6fd3c7732b5dbd09b4cac72858adec843f00698b71db8f8bb389597a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-elymaic noto-sans-elymaic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
