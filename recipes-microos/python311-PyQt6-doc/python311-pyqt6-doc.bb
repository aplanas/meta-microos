SUMMARY = "Examples for python311-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-doc-6.5.0-1.1.noarch.rpm"
RPM_HASH = "414455dc2d3d7c01bb12cc100a9488b9141048296bbb4370fe5da661ccb5b15a8dab0b776d534f117fe93abc6061c45a33f38f33bb6ff3229f428dc7de2c3382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-PyQt6-doc python311-qt6-doc"
RDEPENDS:${PN} += ""

inherit rpm
