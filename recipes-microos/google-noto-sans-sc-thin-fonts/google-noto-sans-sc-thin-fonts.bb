SUMMARY = "Noto Sans Simplified Chinese Font - Thin"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Thin weight of \
Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-thin-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "2444da876656e00e1b12df3636049891b8a2dc9d212524038ce18c5dd131deccd3e970e3ca565b60e9cc9abd39766122b7dcf1c17ca84a1342ed98ebfaba24d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-thin-fonts noto-sans-sc-thin-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
