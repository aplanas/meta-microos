SUMMARY = "Noto Tai Tham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiTham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taitham-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "d8df8069079cdc46e1ec83ce676f747464f5f7d712355a652373c4ce5caaf2f664a7a5f2ffec3d0950c5474e5a943b081b37a9c3645d254a861a4c2fd13655a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taitham noto-sans-taitham-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
