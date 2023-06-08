SUMMARY = "Development files for python39-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python39-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtnetworkauth-qt5-devel-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "d06ac473a6e3fbc83bb64d6e6e54b2a12c44683207d4b534b6d4ec7990ede4c6454e79afa5906d536c93fd355bbac4b055117634feb8a9a4ff2a5f4ccb83627b"

RPROVIDES:${PN} += "python39-qtnetworkauth-qt5-devel python39-qtnetworkauth-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-qt5-devel python39-qtnetworkauth-qt5"

inherit rpm
