SUMMARY = "Noto Devanagari Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-devanagari-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "70334cc03afe8f2b84f6c72ff98834512c3126fcbdf5412da476d969b60ca3b7cc3fe3eb93a3ce19073d3930e9e61b9ab1a0832ff7cfac990dadeb643699883d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-devanagari noto-serif-devanagari-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
