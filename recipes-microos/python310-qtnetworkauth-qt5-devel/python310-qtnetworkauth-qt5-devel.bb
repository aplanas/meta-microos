SUMMARY = "Development files for python310-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python310-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtnetworkauth-qt5-devel-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "b29efdd72a2c8898ceb684af8254a5643c915bea52265f3c8e053eb98289460a1df69560e95ffa3235921a92c980f20990246d25de3e76a36285220d6f2fb649"

RPROVIDES:${PN} += "python3-qtnetworkauth-qt5-devel python310-qtnetworkauth-qt5-devel python310-qtnetworkauth-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-qt5-devel python310-qtnetworkauth-qt5"

inherit rpm
