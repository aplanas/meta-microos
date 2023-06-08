SUMMARY = "Noto Takri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Takri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-takri-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "8ae29f21e21c970e9f430e452c1f5576c5cef85aa9d44e4ca4ba2bfda159f7128ceeb0737542dad5cb4b4bfe7f113a969338dba5ffabe54d1ebbf79a3e9bfa4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-takri noto-sans-takri-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
