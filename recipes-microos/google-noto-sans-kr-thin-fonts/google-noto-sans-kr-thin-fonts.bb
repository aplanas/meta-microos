SUMMARY = "Noto Sans Korean Font - Thin"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Thin weight of \
Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-thin-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "d14e1466e15de232cb5e233ea14b4f035c6d24d6082c3b4e4df96e11e7a8629a60ad24f4d6de64507d4c614b9ab577bceece34a97c2aa22bfde0febc1ce3c53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-thin-fonts noto-sans-kr-thin-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
