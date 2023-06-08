SUMMARY = "Noto Hatran Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hatran Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hatran-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1e3a9d109ab92d7d34ab2c8f46765456335b37a6e9843d137aa8445967e8621197c91235c39db8a71f495d4259b05a53ac5ae5f10b8fe47a9d67a333f014990c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hatran noto-sans-hatran-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
