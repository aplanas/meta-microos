SUMMARY = "Noto Tamil Supplement Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TamilSupplement Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamilsupplement-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ac25a0e2b06a4bf29aead79a0007fc4d143d07cbeb1d9b355b5434061939c34fd30ae8fe489e3a1828b685ebef5260d68f99f10d6bce962ae8da723c741375b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamilsupplement noto-sans-tamilsupplement-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
