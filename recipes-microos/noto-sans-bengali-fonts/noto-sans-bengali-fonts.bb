SUMMARY = "Noto Bengali Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bengali-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "5d3f1d8fe764107b18928a754694f6bc02cf162cc1b0180cf9774f83c0e889c18c0674ea07777c1fd492561b78ade67f348a19225922180a590053fc4eca972b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bengali \
noto-sans-bengali-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
