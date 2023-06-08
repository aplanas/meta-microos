SUMMARY = "Noto Serif Japanese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
All weights of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-fonts-full-2.001-2.3.noarch.rpm"
RPM_HASH = "727a8a7c50801c9598ab58880d8c952f29534fa0da72b0b9b5d0a544cde9d9ee45a0df13f149fcc5de0f972cb30c05d5ceb4c9d0c28687635f37aec75035d094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-fonts-full noto-serif-jp-fonts-full"
RDEPENDS:${PN} += "google-noto-serif-jp-black-fonts google-noto-serif-jp-extralight-fonts google-noto-serif-jp-fonts google-noto-serif-jp-light-fonts google-noto-serif-jp-medium-fonts google-noto-serif-jp-semibold-fonts"

inherit rpm
