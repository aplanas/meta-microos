SUMMARY = "Noto Palmyrene Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Palmyrene Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-palmyrene-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0b41ecb96cce4f5035e24e24066e8d9afd015a43490af75ace7f4d9447f183964ae4ee2569ca2e91c2d2759d9e71dbc70aeb9e22a7ead8d8a2c9a6ae7e12c3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-palmyrene noto-sans-palmyrene-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
