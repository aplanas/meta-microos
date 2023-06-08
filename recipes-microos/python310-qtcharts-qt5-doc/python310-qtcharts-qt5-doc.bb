SUMMARY = "Examples for python310-qtcharts-qt5"
DESCRIPTION = "This package provides python310-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-doc-5.15.6-1.12.noarch.rpm"
RPM_HASH = "f3c0f73ef51a00394d1fe3be6dad6fe5cdafe680e558ba537c8a53e7284766eed0313b6eb81122f8e5569caab870bf0ed39238f05fb2ac872fda591486a71679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtcharts-qt5-doc python310-qtcharts-qt5-doc python310-qtcharts-qt5-examples python311-qtcharts-qt5-examples python39-qtcharts-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
