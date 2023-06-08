SUMMARY = "Documentation for gnuradio-osmosdr"
DESCRIPTION = "Documentation for gr-osmosdr module for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-doc-0.2.4-1.1.noarch.rpm"
RPM_HASH = "52728a9d54ac0a413da0cae6e87ea3080b18e71cf701586095b563ab0e34b7e509dbd3b1f26644fd3fe60e5bcb13352425541ebf7f27352fc923fa14e8c89e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-osmosdr-doc"
RDEPENDS:${PN} += "gr-osmosdr"

inherit rpm
