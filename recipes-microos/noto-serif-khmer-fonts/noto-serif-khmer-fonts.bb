SUMMARY = "Noto Khmer Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-khmer-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6c177b314c0181617e43d60b416afa5402040abdd9dbe86af68c28e2aad997221b22b09b823022115cfa4e0836183f0b43f1e8f4cb846210fa19412cc6b60db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-khmer \
noto-serif-khmer-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
