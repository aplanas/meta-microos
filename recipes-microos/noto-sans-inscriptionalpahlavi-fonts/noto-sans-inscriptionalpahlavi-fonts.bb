SUMMARY = "Noto Inscriptional Pahlavi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalPahlavi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-inscriptionalpahlavi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3992744febbebed26921ed945a49cc1729275aec2475ef2c247e46e6f77e518a0c0bc7d057931d9c7356f27a52ee404e07c558b539dfc020be53f04737fc36f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-inscriptionalpahlavi noto-sans-inscriptionalpahlavi-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
