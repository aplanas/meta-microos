SUMMARY = "Documentation for qt6-sensors in QCH format"
DESCRIPTION = "This package contains documentation for qt6-sensors in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d373fdf1b418eaa8ce825cf163c550957b1fb19ccf86a5d56484beea88810e6c8f55dba44cd1529e6333afafca9fe40b5f0b23d1d1583e9d9d5bd0345adb30de"

RPROVIDES:${PN} += "qt6-sensors-docs-qch qt6-sensors-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
