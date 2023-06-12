SUMMARY = "Noto Serif Simplified Chinese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-regular-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "82b07113b4136ebecc42c06689b6e1357e5dc983ee1788d8b0d3d5fb86330c7acf082174067dbeb4946f6fac979e28be1157fe08bc12d10d62ad7d5fd6c5c8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-regular-fonts \
noto-serif-sc-regular-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
