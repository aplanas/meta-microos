SUMMARY = "Sip and eric API files for python39-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python39-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-devel-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "9eff58afe7ffcf7b5c2ce58b9dc8eaf46788ee917554beaa05b8e749b4059aed914ef7a2b7aef17172fe09d7b1f98f97ca2eff1b51e613566eee279421edd900"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api python-qtdatavis3d-qt5-sip python39-qtdatavis3d-qt5-api python39-qtdatavis3d-qt5-devel python39-qtdatavis3d-qt5-devel(aarch-64) python39-qtdatavis3d-qt5-sip"
RDEPENDS:${PN} += "python(abi) python39-qt5-devel"

inherit rpm
