SUMMARY = "Noto Telugu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-telugu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dfbb39e4806fc903b3b9efd48c908add7bc6d428991d6bebe30b11549a0ef3db0accaa2f8510fffdde95a12c04aa2a09243a05a8a58172c5218c13e5af30ecce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-telugu \
noto-sans-telugu-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
