SUMMARY = "Noto Serif Simplified Chinese Font - Extralight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Extralight weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-extralight-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "4e89b6b0b47417b033530b6a7ca3de18758d635bb3490cbd0f405a9ed35955454841a9e0fe1b59dc64ab88d9d899342f77c12a64565d6dfa1ac1b8d24bb9bf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-extralight-fonts noto-serif-sc-extralight-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
