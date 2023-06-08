SUMMARY = "Documentation for qt6-mqtt in QCH format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-mqtt-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "bd962427ac784788a305fa64b0f9880f3f0dfed9f83f0de9cdee177f1f09f80af2304a953264772cab0373769c1cf681c85aeca916d18f4ca23e03bb2af90521"

RPROVIDES:${PN} += "qt6-mqtt-docs-qch qt6-mqtt-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
