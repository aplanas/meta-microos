SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
All weights of Serif font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-hk-fonts-full-2.001-2.3.noarch.rpm"
RPM_HASH = "06fd1d176ec078192150cba930654cf6738bf742b4c2134993f282a8417c00dfb839e7df3b87f6388b6efc6c9de572b512dda32c03649475bf6d27065f569fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-fonts-full noto-serif-hk-fonts-full"
RDEPENDS:${PN} += "google-noto-serif-hk-black-fonts google-noto-serif-hk-extralight-fonts google-noto-serif-hk-fonts google-noto-serif-hk-light-fonts google-noto-serif-hk-medium-fonts google-noto-serif-hk-semibold-fonts"

inherit rpm
