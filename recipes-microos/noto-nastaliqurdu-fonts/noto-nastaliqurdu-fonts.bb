SUMMARY = "Noto Nastaliq Urdu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NastaliqUrdu font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-nastaliqurdu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c73eb0d5cb535567ccd63a6349c1352b9f7d3f67be84cdff9b1ff058610c45f150df53a18502410b91ba9cedb4ae869b59a7d85a706e1a231cd513d1ed882f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-nastaliqurdu noto-nastaliqurdu-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
