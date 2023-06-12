SUMMARY = "Noto Old Permic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPermic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldpermic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9894ed94773809bc6790a96b86e5e069f3d2fef9b02a89cfb99d1c7cb91459f3e599a23ee9698a4a4f498adbce98e1ac39e1f54778480548d2008d512620aadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldpermic \
noto-sans-oldpermic-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
