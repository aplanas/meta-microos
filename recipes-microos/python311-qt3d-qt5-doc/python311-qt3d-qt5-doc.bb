SUMMARY = "Examples for python311-qt3d-qt5"
DESCRIPTION = "This package provides python311-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-doc-5.15.6-1.6.noarch.rpm"
RPM_HASH = "785ff19b6f4a6fd70d8b5b874c4bdc27ab08f638eebbe604073777703565d25cd3a51db1e670669963de32a53063424a9b5eb2a025ffd40a8c83e037eb49b2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qt3d-qt5-examples python311-qt3d-qt5-doc python311-qt3d-qt5-examples python39-qt3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
