SUMMARY = "Noto Oriya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oriya-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "59e761e0e60f315183c1649e905630459a6d241c045a76858ab063db195a5c70e51f91ec93c5cc1ac466e8bb90e2cb6ed685f30b1c2de70b286d16eef5cb1dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oriya noto-sans-oriya-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
