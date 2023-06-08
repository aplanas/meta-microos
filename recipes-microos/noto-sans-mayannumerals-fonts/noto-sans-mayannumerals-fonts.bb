SUMMARY = "Noto Mayan Numerals Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MayanNumerals Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mayannumerals-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "af4ba3db875ca9eec10d036ed6e5d05bc55a10f4d8263cba738c991405833ba2d2ab95f429be9c66497026cf345eb4c66329752c20a9bf6ea76773fece30d4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mayannumerals noto-sans-mayannumerals-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
