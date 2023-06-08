SUMMARY = "Noto Tamil Slanted Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TamilSlanted Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tamilslanted-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "03e78dfcfcd1aedee7e2dc07e5160855740f829c4dff7485f90a3e69dad0a479cebdeeb50dbf74cd693eee63722a0e93866234d984c46e8f711f05d84810360e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tamilslanted noto-serif-tamilslanted-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
