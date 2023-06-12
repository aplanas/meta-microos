SUMMARY = "Noto Marchen Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Marchen Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-marchen-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "bb06f8a1b42b984de53fa1db5d1bb4a6328b40d23e6796d277ed0dd8a65539e2c68bd725cda72a1241188603226858448cbb674934afd9633ac84bbbb7594502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-marchen \
noto-sans-marchen-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
