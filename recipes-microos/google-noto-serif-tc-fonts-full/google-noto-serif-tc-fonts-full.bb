SUMMARY = "Noto Serif Traditional Chinese Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
All weights of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-fonts-full-2.001-2.3.noarch.rpm"
RPM_HASH = "3a8e513aa91697b8fc62cfa752a0f353a49517272a12fcefdb6f8345dec1b67de59cdcaa029b7ce5c0f6e733efd17def98e455e47faf2c6e46455fd5c6302a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-fonts-full noto-serif-tc-fonts-full"
RDEPENDS:${PN} += "google-noto-serif-tc-black-fonts google-noto-serif-tc-extralight-fonts google-noto-serif-tc-fonts google-noto-serif-tc-light-fonts google-noto-serif-tc-medium-fonts google-noto-serif-tc-semibold-fonts"

inherit rpm
