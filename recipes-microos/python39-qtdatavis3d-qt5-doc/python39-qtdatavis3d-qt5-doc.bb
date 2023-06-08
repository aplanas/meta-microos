SUMMARY = "Examples for python39-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python39-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-doc-5.15.5-1.5.noarch.rpm"
RPM_HASH = "c3f60dabaae1fefddc8c4b8efc37d79cb648e73c860ad822ca7c8c409237724c053ebcce7734b05371bf1caf12bd367ec32344a7a2b996d62e11ca5abac391eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtdatavis3d-qt5-examples python311-qtdatavis3d-qt5-examples python39-qtdatavis3d-qt5-doc python39-qtdatavis3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
