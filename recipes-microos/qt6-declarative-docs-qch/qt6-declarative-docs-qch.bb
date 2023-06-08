SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-declarative-docs-qch-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "b027783e85a43463d4bd2371efbe3651e6c69f8c72ba808ad212d5908795d5c4d1c0a83256535285df9813b5239d3735f45b068e90281ee5bf4aab586ec9c1cc"

RPROVIDES:${PN} += "qt6-declarative-docs-qch qt6-declarative-docs-qch(aarch-64) qt6-quickcontrols2-docs-qch"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
