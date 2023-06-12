SUMMARY = "Noto Tamil Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamil-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "23a6c38a7b4f30184e6d3dbadfe94c10170b4c1dc6784bac898265f4387e4c6fa0bbaa0f5cd69535b9dd05a7a1148974c3eea4d13a51244686ead25be24e9056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamil-ui \
noto-sans-tamil-ui-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
