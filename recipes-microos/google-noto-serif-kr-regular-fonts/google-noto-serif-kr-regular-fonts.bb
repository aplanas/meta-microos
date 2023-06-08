SUMMARY = "Noto Serif Korean Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-regular-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "88fbda201ac559987b6b251606f634303c88fc8b5cec52b557119cd744d8bd5cafc4f0bd725a6125a2cb49fc5dd472a34f7b373f7bd4b888c004c115f91f49e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-regular-fonts noto-serif-kr-regular-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
