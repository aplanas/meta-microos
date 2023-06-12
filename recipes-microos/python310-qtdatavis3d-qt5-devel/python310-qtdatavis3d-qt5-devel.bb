SUMMARY = "Sip and eric API files for python310-qtdatavis3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and Qt5 Data Visualization library API files for the Eric IDE for python310-qtdatavis3d-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-devel-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "cfa08f6629be1c784eedbdde9d1f63a5fbfc2414eadad3a836f6b80cfdbe31f61e83e9243c099d581c0e61316a0b900385228401cb022044e7c107c86ee5517d"

RPROVIDES:${PN} += "python-qtdatavis3d-qt5-api \
python-qtdatavis3d-qt5-sip \
python3-qtdatavis3d-qt5-api \
python3-qtdatavis3d-qt5-devel \
python3-qtdatavis3d-qt5-sip \
python310-qtdatavis3d-qt5-api \
python310-qtdatavis3d-qt5-devel \
python310-qtdatavis3d-qt5-devel(aarch-64) \
python310-qtdatavis3d-qt5-sip"
RDEPENDS:${PN} += "python(abi) \
python310-qt5-devel"

inherit rpm
