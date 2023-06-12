SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-pytest-qt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "4ad261040511fdd55ef7a5f47f3b6edab464567640175e6c363bd92fe93c4da61d01d58d75600aaaf50cc12aad5726faa7e661bab723a6d64f2500455a5a4d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt python3.10dist(pytest-qt) python310-pytest-qt python3dist(pytest-qt)"
RDEPENDS:${PN} += "(python310-qt5 or python310-PyQt6 or python3-pyside2 or python3-pyside6) bitstream-vera-fonts python(abi) python310-pytest"

inherit rpm
