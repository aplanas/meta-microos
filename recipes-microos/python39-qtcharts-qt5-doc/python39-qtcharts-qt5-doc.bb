SUMMARY = "Examples for python39-qtcharts-qt5"
DESCRIPTION = "This package provides python39-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qtcharts-qt5-doc-5.15.6-1.12.noarch.rpm"
RPM_HASH = "9dad5c52dbbc460a511278e8cb7f664ccb1d02430ba3b9a398ca1cffef64a5aa4ee322f53c0c867c57b26155a300906b914e160e4b84e73720385fc2947e1aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtcharts-qt5-examples python311-qtcharts-qt5-examples python39-qtcharts-qt5-doc python39-qtcharts-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
