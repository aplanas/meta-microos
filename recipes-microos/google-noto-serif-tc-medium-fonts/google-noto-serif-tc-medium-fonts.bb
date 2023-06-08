SUMMARY = "Noto Serif Traditional Chinese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medium weight of Serif font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-tc-medium-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "521d1eee9b8cd591af5982153b2362595eafb11446db7c05bb8254d914966b50ff02328b67fdacd45b3ac32d43a1b4d207ebd5704dd5c0e8f6efc3511553652c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-medium-fonts noto-serif-tc-medium-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
