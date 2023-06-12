SUMMARY = "Noto Cousine Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cousine font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-cousine-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0882e17a4bd1eb4a23706f8a7af3c8ea3bea46fee0b70ff850f38ed41244e0d4890349ce4dabbcb720c56a18a9d3ec00e8fac853d6a63758050e9503632e4845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cousine-fonts \
noto-cousine \
noto-cousine-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
