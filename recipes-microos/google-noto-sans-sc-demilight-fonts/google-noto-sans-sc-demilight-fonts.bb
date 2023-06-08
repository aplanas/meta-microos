SUMMARY = "Noto Sans Simplified Chinese Font - DemiLight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Demilight weight \
of Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-demilight-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "7545eb338ae411c3eb3407e59d6a23ee70a0ff8589894db1ad88236e86d27f607319c7da8e343fb6aefa5fca91c3340a9339495b09a450ea4dc58c7e6d2fa31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-demilight-fonts noto-sans-sc-demilight-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
