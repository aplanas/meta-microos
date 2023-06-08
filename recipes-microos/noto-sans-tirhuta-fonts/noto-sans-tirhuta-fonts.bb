SUMMARY = "Noto Tirhuta Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tirhuta Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tirhuta-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "001dcfd74b55d21dbfe378ba9e2dd82b315d9c741ee4bf3947d0bfe42985530f38d0d8b5dc026f95966667ef9e5e412f241647976ff8ac579db659d8ebd215f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tirhuta noto-sans-tirhuta-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
