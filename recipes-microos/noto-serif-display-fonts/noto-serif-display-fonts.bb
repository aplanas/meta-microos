SUMMARY = "Noto Display Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Display Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-display-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "b3090677ff0ddd8ec6d62fce5785c66c4e11317fa85022b513df0de29452c8c9d8b01781de84d0ea4bb21934d492f2a8dc0cda58edebe43c4c01980835ffdf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-display \
noto-serif-display-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
