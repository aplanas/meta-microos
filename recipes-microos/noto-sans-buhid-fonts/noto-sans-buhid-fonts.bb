SUMMARY = "Noto Buhid Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Buhid Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-buhid-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c952a6b813c00a352ff6b8a286d6f24ec060230c4429216710aa6aa2ef4077ae58dc303c872517c0c5c1acb9cb21f6b09fddffef2cea7067d53135b3284e4116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-buhid \
noto-sans-buhid-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
