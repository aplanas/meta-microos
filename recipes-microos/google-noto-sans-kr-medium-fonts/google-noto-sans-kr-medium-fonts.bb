SUMMARY = "Noto Sans Korean Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Medium weight of \
Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-medium-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "6f2e141f6b5fc6cf85520cf2cf2cb4aa55df9ccbae659befda6582955bc4bc0a09fc13372b81ff863ba40b9b213b2f9d69dfb2bb0f8f702d65585c579be564a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-medium-fonts \
noto-sans-kr-medium-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
