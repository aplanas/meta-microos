SUMMARY = "Examples for python39-qt3d-qt5"
DESCRIPTION = "This package provides python39-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-doc-5.15.6-1.6.noarch.rpm"
RPM_HASH = "630a0a9267745bc3dcde53fbb8061ccf462e066bc534a2ea86989c8747e436b884ef4a472ea428f7d2f914168be552adc3b8f786a54e9924ab28389e7652ba17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qt3d-qt5-examples python311-qt3d-qt5-examples python39-qt3d-qt5-doc python39-qt3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
