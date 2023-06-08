SUMMARY = "Noto Javanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Javanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-javanese-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1866d0d59b4175bbde4b6b876eb2265d22fa5f8f4ca02b59574240fe49e02a11f81e12fa26af7f7dea14f93d844e986185dd0ce1b51b85dc66e3b8797c1ab0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-javanese noto-sans-javanese-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
