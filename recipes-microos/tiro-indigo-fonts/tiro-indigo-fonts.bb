SUMMARY = "Tiro Fonts for some of the major Indian writing systems"
DESCRIPTION = "This packages contains all of the Tiro Indigo Fonts which have their \
origins in a typeface designed for the Murty Classical Library of India \
book series, so is especially suited to traditional literary publishing \
but also made with the needs of today’s multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-indigo-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "87064cad1e7a62d766680c6308b052a174fe096b909949320371f91c5b22c0f8b0db885ae79ea0a1f03cf8548a162a89ef276333f0ca99f5265e61f9e2e0bc8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-indigo-fonts"
RDEPENDS:${PN} += "tiro-bangla-fonts \
tiro-devahindi-fonts \
tiro-devamarathi-fonts \
tiro-devasanskrit-fonts \
tiro-gurmukhi-fonts \
tiro-kannada-fonts \
tiro-tamil-fonts \
tiro-telugu-fonts"

inherit rpm
