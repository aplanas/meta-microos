SUMMARY = "Noto Mandaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mandaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mandaic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "07bf1d150e4f2db812c9892f496f6bb9be39d2e4238378f5c2fc5bc4de26f963d4bc835234d925076e83b08e861076cefa10db7e85a818a2314108aa55f850c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mandaic \
noto-sans-mandaic-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
