SUMMARY = "Devel files for python310-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-WebEngine-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fd0343134598bcf94b809d619a6730e98e4289e84e54093a4da862760d02761849499a39384a40282ee89aa51918540d366a62804524cc711770ed7aa0b3158e"

RPROVIDES:${PN} += "python3-PyQt6-WebEngine-devel python310-PyQt6-WebEngine-devel python310-PyQt6-WebEngine-devel(aarch-64)"
RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
