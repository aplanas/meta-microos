SUMMARY = "Documentation for qt6-multimedia in QCH format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cc688350c08141eb6aeea041cd7cd16562ad4aeecc7685792e598ed9b8d0300793fdae34c0a591db6ec0961937d781d15cc72bdcfc3b4aa7fda5263a352662bc"

RPROVIDES:${PN} += "qt6-multimedia-docs-qch qt6-multimedia-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
