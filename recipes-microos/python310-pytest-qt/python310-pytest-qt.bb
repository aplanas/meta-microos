SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-pytest-qt-4.2.0-1.4.noarch.rpm"
RPM_HASH = "883982a4fb0b03fcec0b034388c8139e40566740efb4fd8d72be65969765e1674c48c614ef1f0f35793b30813a13d83acd4a3a5fe2eab6f10bcc1a2beba2c48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt python3.10dist(pytest-qt) python310-pytest-qt python3dist(pytest-qt)"
RDEPENDS:${PN} += "(python310-qt5 or python310-PyQt6 or python3-pyside2 or python3-pyside6) bitstream-vera-fonts python(abi) python310-pytest"

inherit rpm
