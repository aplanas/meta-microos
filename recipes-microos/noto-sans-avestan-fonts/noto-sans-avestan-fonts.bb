SUMMARY = "Noto Avestan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Avestan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-avestan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "bd76813628db1d9b5c9fd1d328da446c14d7483a5a17763f360d9e9d32be045fb2ce3dba1491115df6b71864a5ce0ce03e088944177f049a88e63492f6706b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-avestan noto-sans-avestan-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
