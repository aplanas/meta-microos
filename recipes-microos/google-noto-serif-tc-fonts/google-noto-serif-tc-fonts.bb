SUMMARY = "Noto Serif Traditional Chinese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular and Bold weights of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "5c7f6b92d50160d215c03216f4d94a268b58c608e531288eade8de358655202ab0eb01af35508825e4cb182b443c9acc6ae8129270af27cb26bbd1a9c198391b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-fonts \
locale(zh_TW) \
noto-serif-tc-fonts \
scalable-font-zh-TW"
RDEPENDS:${PN} += "google-noto-serif-tc-bold-fonts \
google-noto-serif-tc-regular-fonts"

inherit rpm
