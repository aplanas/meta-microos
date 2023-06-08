SUMMARY = "Noto Chakma Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Chakma Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-chakma-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "36d3fbcc6376c2771a8e1ca89f96eb45ca175aeed2abfee448d8e7f29451f667726920789f09714ecf24b5c1bbb383ab58790f4c287d00daaf45058ba2a09f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-chakma noto-sans-chakma-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
