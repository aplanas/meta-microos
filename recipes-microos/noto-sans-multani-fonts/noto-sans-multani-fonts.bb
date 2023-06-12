SUMMARY = "Noto Multani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Multani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-multani-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c6c4264ef304fa378edbe7ea417670e14af71f68d4972f26bbcc1734808302284f3baaa815dfdfaca135438c0eedd276d4e108e3c67038a7dccba73d38635a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-multani \
noto-sans-multani-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
