SUMMARY = "Noto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5856b3ea624c24890c930ddd62aaf5e4cf376017a228dcde6f9cb8cd56726f930e803ce8a0fcd8957d061be0f877004bb9d92c9a78f8902f2ad09e004b087b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif noto-serif-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
