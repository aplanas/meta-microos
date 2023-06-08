SUMMARY = "Noto Cuneiform Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cuneiform Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cuneiform-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "24b98006990eeb56cba7d32c2c9def0ad637df5efd75754746f4fb25dac38e8b2a7ee10f59cce8958a2a994b5b87fa14f60d62e7b35805d16045472256e3c23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cuneiform noto-sans-cuneiform-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
