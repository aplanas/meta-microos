SUMMARY = "Noto Ugaritic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ugaritic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ugaritic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c12c025f9de7166fa337b49b258e36136ed4cdf029fd4163d24403cedb5c83e603e296c221536d4305272aa9ce39ff94deb27e72bb004a7222dae72345052777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ugaritic \
noto-sans-ugaritic-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
