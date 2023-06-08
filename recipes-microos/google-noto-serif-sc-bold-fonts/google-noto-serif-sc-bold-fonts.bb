SUMMARY = "Noto Serif Simplified Chinese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bold weight of Serif font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-sc-bold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "a2cc369bedff6515b3b092f81b74f51b01f9ce110100b351084bf675501d786fd6dd3d8048f6b08f57218e37e6a10bc2591e759a0d4cd7915962c9762cbe123a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-bold-fonts noto-serif-sc-bold-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
