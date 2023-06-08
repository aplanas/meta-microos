SUMMARY = "Noto Arabic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arabic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-arabic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9b56371dacc6b0a036a4b455cd418b3ccc6ed19fdf474d236c1d1b8a4e0154a416795f34ecbdb8ebc04068e568974b83d865554e4f3c53839d37c980a0b3a8d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-arabic noto-sans-arabic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
