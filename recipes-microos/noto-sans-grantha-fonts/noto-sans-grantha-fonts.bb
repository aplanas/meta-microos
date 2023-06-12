SUMMARY = "Noto Grantha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-grantha-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e7985f1645f5d6a34f90e8f527fb88aa20e15660476f3d45dded6e9ce9652c3881d2a13284dc522c8bf6242c38b109b34e61e0dc5a0fdcb320687e70dd6ddf82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-grantha \
noto-sans-grantha-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
