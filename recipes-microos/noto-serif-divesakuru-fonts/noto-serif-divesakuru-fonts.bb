SUMMARY = "Noto Dives Akuru Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
DivesAkuru Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-divesakuru-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f0f9d48258a502eb492616a94d15007c870a03d9e97891800d468484f01520b4b976b957261b56fdc202cd43216ab8b120e19615d0d6f679a52c82579162e0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-divesakuru noto-serif-divesakuru-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
