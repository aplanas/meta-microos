SUMMARY = "Noto Serif Korean Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
All weights of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-fonts-full-2.001-2.3.noarch.rpm"
RPM_HASH = "8115d241fd644335803b1a58a79a5e108f3dc671d2c57c012d6d891836f62a03d909d6f592f7507fdf012f4076fe2ba0a4d38dc8b59398f196a600ef42300e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-fonts-full noto-serif-kr-fonts-full"
RDEPENDS:${PN} += "google-noto-serif-kr-black-fonts google-noto-serif-kr-extralight-fonts google-noto-serif-kr-fonts google-noto-serif-kr-light-fonts google-noto-serif-kr-medium-fonts google-noto-serif-kr-semibold-fonts"

inherit rpm
