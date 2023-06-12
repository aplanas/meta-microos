SUMMARY = "Documentation for qt6-qt5compat in QCH format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b5e6d0c29212249984a3d5b91edb70e93302853df3a9e0ac253a3254cb27c666b2553b66fb1dea8da1776a385306dd7f11c9d1df9a2921ef8f4750c26b83fa0b"

RPROVIDES:${PN} += "qt6-qt5compat-docs-qch qt6-qt5compat-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
