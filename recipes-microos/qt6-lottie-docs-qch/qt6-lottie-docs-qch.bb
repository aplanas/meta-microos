SUMMARY = "Documentation for qt6-lottie in QCH format"
DESCRIPTION = "This package contains documentation for qt6-lottie in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-lottie-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9005ff93660de2c54fd3062469fd4fa5dd95ae9f4ecf571d0ea25ebb7ad076b05765d026d2ffa6aa72559f0dec7d5de3bf798c5dafd52298131662da218da017"

RPROVIDES:${PN} += "qt6-lottie-docs-qch qt6-lottie-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
