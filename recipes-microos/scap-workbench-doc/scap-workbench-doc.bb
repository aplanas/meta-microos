SUMMARY = "Documentation for scap-workbench"
DESCRIPTION = "This package provides HTML documentation for scap-workbench."
LICENSE = "GPL-3.0-only"

PV = "1.2.1+git20221219.10c1929"

RPM_NAME = "scap-workbench-doc-1.2.1+git20221219.10c1929-1.1.aarch64.rpm"
RPM_HASH = "03acbbacb31318bb4245e8e23df13898b0b2f6b4a57382d7a2f93687d3010544a0a2bea0c32f176d0294fc7cd336e6dc95830f63bffd1518b27462a961d8690c"

RPROVIDES:${PN} += "scap-workbench-doc scap-workbench-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
