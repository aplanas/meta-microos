SUMMARY = "Examples for python310-qt3d-qt5"
DESCRIPTION = "This package provides python310-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-doc-5.15.6-1.6.noarch.rpm"
RPM_HASH = "420965859f680b5af694036c298630f62b9ddd8328a51148f86378a7d5282ef9d1e3fdfcb5e870a4f751be10c8a827b885b4430dff14ba8b59bf8ba1538a65d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qt3d-qt5-doc python310-qt3d-qt5-doc python310-qt3d-qt5-examples python311-qt3d-qt5-examples python39-qt3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
