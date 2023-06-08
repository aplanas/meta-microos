SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular and Bold weights of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "0e0ce4695cafe7f4a1fe2d4b093ade50dcdd45e5166aedf99f199b3ce2317bee9dbc450a574e93c9e7d2198b85ccec3cf1c3bb5f1a7a01649075d6fae277ff76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-fonts locale(zh_HK;zh_MO) noto-serif-hk-fonts scalable-font-zh-HK scalable-font-zh-MO"
RDEPENDS:${PN} += "google-noto-serif-hk-bold-fonts google-noto-serif-hk-regular-fonts"

inherit rpm
