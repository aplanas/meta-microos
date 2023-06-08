SUMMARY = "Noto Warang Citi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
WarangCiti Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-warangciti-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "7dd75b712592d8b7aa1628a345c784e4e040339f5ded2415ffc34a21ed2b982e342e21bb5ec922d1cbceabe8cf7d5fd706f6b4cb96d429bc04276801cbdc1394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-warangciti noto-sans-warangciti-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
