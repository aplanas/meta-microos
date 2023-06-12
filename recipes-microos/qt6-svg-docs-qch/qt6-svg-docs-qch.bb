SUMMARY = "Documentation for qt6-svg in QCH format"
DESCRIPTION = "This package contains documentation for qt6-svg in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-svg-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "abbc68e7cf1df76a2ae74845fd58c8a5751cc9f7ab9cd4890198749a51b437918d5109fe429d251fc1255a240da42106c732c550d71c01c830896dad936e72b0"

RPROVIDES:${PN} += "qt6-svg-docs-qch qt6-svg-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
