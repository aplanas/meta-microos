SUMMARY = "Noto Bengali Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bengali-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "05e8ac18da65604a3e15ddd8b86be5eafc64df78d4d84a3c42363797af0955bfe99f7a0fc8d53516c2dd3ab2cd01f222836bde03087d33d6eba9987893784814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bengali-ui noto-sans-bengali-ui-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
