SUMMARY = "Documentation for qt6-opcua in QCH format"
DESCRIPTION = "This package contains documentation for qt6-opcua in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b964b4506dcd1cd872efa836f44bf40cb7a0a0b53e6e68efbb09ac1af218a4be6ca9e97248ca24b0a2b37c971d3745e71def5e67981c75942b14876045397c30"

RPROVIDES:${PN} += "qt6-opcua-docs-qch qt6-opcua-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
