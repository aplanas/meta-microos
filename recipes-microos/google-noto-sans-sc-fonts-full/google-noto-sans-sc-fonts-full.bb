SUMMARY = "Noto Sans Simplified Chinese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains All weights for \
Sans fonts for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-fonts-full-2.004-3.3.noarch.rpm"
RPM_HASH = "a9f784ac79ef34ffdb02014e858e46aa20bb43b4c465703225649874d88d3666f35b220bff2d25cf1846b1202ba812a155506b150244893d711a662c7fd0f6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-fonts-full \
noto-sans-sc-fonts-full"
RDEPENDS:${PN} += "google-noto-sans-sc-black-fonts \
google-noto-sans-sc-demilight-fonts \
google-noto-sans-sc-fonts \
google-noto-sans-sc-light-fonts \
google-noto-sans-sc-medium-fonts \
google-noto-sans-sc-thin-fonts"

inherit rpm
