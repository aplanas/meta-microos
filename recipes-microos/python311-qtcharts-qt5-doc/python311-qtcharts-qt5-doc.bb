SUMMARY = "Examples for python311-qtcharts-qt5"
DESCRIPTION = "This package provides python311-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qtcharts-qt5-doc-5.15.6-1.12.noarch.rpm"
RPM_HASH = "558600261f11ce5e69bc1f6f23ece2bfeafeb29f8b738f16fb1d35e6abcac85da143608b35ca7d6565fcbea294d57b601fe37a756f48cb60e553f6e92184d774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtcharts-qt5-examples \
python311-qtcharts-qt5-doc \
python311-qtcharts-qt5-examples \
python39-qtcharts-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
