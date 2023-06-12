SUMMARY = "Noto Coptic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Coptic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-coptic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9f21f7b1a034cdcfb183502301604c8775885053689f5556a66b971b79f4518c539a223fd83e4f30d2606fcea0afd104614c71a77cb6f6665832911a727b21b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-coptic \
noto-sans-coptic-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
