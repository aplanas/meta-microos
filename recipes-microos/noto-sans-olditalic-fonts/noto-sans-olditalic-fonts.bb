SUMMARY = "Noto Old Italic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldItalic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-olditalic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0e02c68a9efd799ee19b47aa95765842010531c047d960c11ca1e3f93145b96fda3bb9cbc51905638cad86247464fef599d190fdd25d45ee06c2069a53e847b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-olditalic noto-sans-olditalic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
