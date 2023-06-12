SUMMARY = "Noto Limbu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Limbu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-limbu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "4b23ed1ddb28292bf8e6102f8ea124446d911e027fa2a392d9f05655dde3b9300b881ab4f87937a9c7ef146abe4a65b64a3d741414d8dcc4fdf1860566a87c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-limbu \
noto-sans-limbu-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
