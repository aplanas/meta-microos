SUMMARY = "Noto Khojki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khojki-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c59fccf2754f2cfd29f8ad333011910cb7df4b8c7d9a8deb0016370816e8eb3933c15c17f6438ce8eabe1462b34a495a1f776ccb608561a37c7675d2ac222a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khojki noto-sans-khojki-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
