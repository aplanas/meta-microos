SUMMARY = "Noto Sans Japanese Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights of Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "7d685290616647cc3f53f33cdef315af344c360ed84c236d8d7b9f3f39cc29cce7565ce9fa4fc54110188ba09350f8b8621ecf26da760d5fd522a7d6b93ba13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-fonts locale(ja) noto-sans-cjkjp noto-sans-cjkjp-fonts noto-sans-jp-fonts scalable-font-ja"
RDEPENDS:${PN} += "google-noto-sans-jp-bold-fonts google-noto-sans-jp-regular-fonts"

inherit rpm
