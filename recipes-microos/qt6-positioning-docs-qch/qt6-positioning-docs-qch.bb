SUMMARY = "Documentation for qt6-positioning in QCH format"
DESCRIPTION = "This package contains documentation for qt6-positioning in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f8ff9ffcafbb9f5b417aa498477bbb78c56acc8bead71d557aac36e9497c35ed7d4c2e073cb9d46719aa99f4c0c54a7c7b09240b1fd2ecabeba36762ea8127c6"

RPROVIDES:${PN} += "qt6-location-docs-qch qt6-positioning-docs-qch qt6-positioning-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
