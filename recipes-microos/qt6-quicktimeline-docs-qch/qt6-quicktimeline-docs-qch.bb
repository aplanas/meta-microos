SUMMARY = "Documentation for qt6-quicktimeline in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quicktimeline-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "549d5b045cec7bdcec0cfa7a28ad7797a46d69d540633e6629439f6c6ec46e66ee83ba172d32f545d60b0c302f038d0339cff643a4c84b496209bff9a8cc49ae"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-qch qt6-quicktimeline-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
