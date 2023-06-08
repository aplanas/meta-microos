SUMMARY = "Noto Malayalam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-malayalam-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "93366e3609965fa115d36a2f97ba73bed7992004b64f567c60296cdee41268437ec3c5cd566d4969360332f1b6c9a3d2245c77b73229c0cfd1d3c8a7de277407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-malayalam noto-sans-malayalam-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
