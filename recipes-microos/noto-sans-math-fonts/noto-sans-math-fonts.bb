SUMMARY = "Noto Math Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Math Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-math-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dd6e03ca3ca15c587bace9d6b1e1a50fbed8133a79b812c029a168f257c40a0b74e8bd865a1510f6f28df53cae1c5106f9dd4ee68a5fdc6de112890d78e878fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-math \
noto-sans-math-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
