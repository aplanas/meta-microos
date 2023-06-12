SUMMARY = "Noto Serif Korean Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medium weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-medium-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "fd9933e34709fb61cc077de5da08ae175c9147c987d6c5852051b015cba2beeea485088d0bcf61436e831459ac47a13555a90da65cf4281b37a12b10e2ae77d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-medium-fonts \
noto-serif-kr-medium-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
