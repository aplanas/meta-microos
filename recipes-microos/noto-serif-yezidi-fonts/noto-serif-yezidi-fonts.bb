SUMMARY = "Noto Yezidi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Yezidi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-yezidi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "584bc9d83bee0c960f2c5999a28e80609f5872d3a41addf92572cc261b0464948bfb0248a91750724c13912e19d0d240fae44cb554b39521051f9942f48f2bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-yezidi \
noto-serif-yezidi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
