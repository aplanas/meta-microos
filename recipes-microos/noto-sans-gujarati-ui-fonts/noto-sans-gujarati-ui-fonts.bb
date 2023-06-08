SUMMARY = "Noto Gujarati Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gujarati-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5e9530c9d17b92ae375a0a270a6b60459cc24dec427d08e69a84b5bc9210145a1bc0bf85752ff278858a483bdb8e2fbdc8cf23081e713c2ac136000ac2bab936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gujarati-ui noto-sans-gujarati-ui-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
