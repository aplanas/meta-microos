SUMMARY = "Noto Serif Traditional Chinese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Light weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-light-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "343e596ba9155f3b8f00eabece767cf1a488ff7141bfb456f2d3ba1795f3c318beca6d4a5b961070b6863e8098f34ec632654139306c088a027941c982ab0c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-light-fonts noto-serif-tc-light-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
