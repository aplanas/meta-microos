SUMMARY = "Documentation for qt6-svg in QCH format"
DESCRIPTION = "This package contains documentation for qt6-svg in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-svg-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f38bf1fd155f096c0efbe84a480762f6d4d1b134e9283e7e180582fdb7a53bb014c61d590dd4e28e113d1e0ec16eea0f3367611afd32627ad191e86b766f0890"

RPROVIDES:${PN} += "qt6-svg-docs-qch qt6-svg-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
