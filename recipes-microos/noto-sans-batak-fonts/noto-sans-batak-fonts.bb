SUMMARY = "Noto Batak Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Batak Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-batak-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "49c38e978f03637dfa060aa3d6098d8636c9aee4347d260fda3ce79d9232f9bbe191585bca3ff197ca5bc0080e9902edefd2d381e04ea6301f758427012060e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-batak noto-sans-batak-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
