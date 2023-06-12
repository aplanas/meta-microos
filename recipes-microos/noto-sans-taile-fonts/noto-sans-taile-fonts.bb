SUMMARY = "Noto Tai Le Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiLe Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taile-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "65c0af5fefa5f79a45bacb5832a75ff261dfae9346a255d79b5844263225b70f5c813ff644860c09a5c8965c71e95c907e3c86f8e3d073dcef1ccff9d6d46a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taile \
noto-sans-taile-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
