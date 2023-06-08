SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-pytest-qt-4.2.0-1.4.noarch.rpm"
RPM_HASH = "d77057f77fd14a65692509f72242e98410605e325617682ef11e2a4f53aa3b111633a04c9545f007d1ba134a58d5c74a0ca7fd4d680cf1b3181035d1ab62928e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-qt) python39-pytest-qt python3dist(pytest-qt)"
RDEPENDS:${PN} += "(python39-qt5 or python39-PyQt6) bitstream-vera-fonts python(abi) python39-pytest"

inherit rpm
