SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python311-protobuf-21.12-3.1.aarch64.rpm"
RPM_HASH = "8d9a588757ac12597d391b8a1b02678ce356b91e67e64c34626be8b23d2b8d9385d8517b1519b546f66e97b62cab3b287b958e31ac158352b8d1e232b6982a4f"

RPROVIDES:${PN} += "python3.11dist(protobuf) python311-protobuf python311-protobuf(aarch-64) python3dist(protobuf)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
