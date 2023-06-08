SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-pytest-qt-4.2.0-1.4.noarch.rpm"
RPM_HASH = "2d73ac6ae10054f1d21358139e44296f10333f433368ff06ce67cc63a96abef2d918cbfac477b1c1dceb8763128c24483568ff9dcef8cee4edca7dd73eea3efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-qt) python311-pytest-qt python3dist(pytest-qt)"
RDEPENDS:${PN} += "(python311-qt5 or python311-PyQt6) bitstream-vera-fonts python(abi) python311-pytest"

inherit rpm
