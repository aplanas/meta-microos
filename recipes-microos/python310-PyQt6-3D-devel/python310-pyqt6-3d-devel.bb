SUMMARY = "Devel files for python310-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-3D-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "72ae7552f8fafbb686181a1f6fe63b765f027afff0069b7005806e1dd95bc8ea03c59398be9490d06adf14b8a61cdafcf2c76b0adfebeb5cbefad3dfb039dd80"

RPROVIDES:${PN} += "python3-PyQt6-3D-devel python310-PyQt6-3D-devel python310-PyQt6-3D-devel(aarch-64)"
RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
