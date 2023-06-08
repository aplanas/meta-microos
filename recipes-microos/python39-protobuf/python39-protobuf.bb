SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python39-protobuf-21.12-3.1.aarch64.rpm"
RPM_HASH = "7525b1ba794201df4fa2ba1772d277b21e72b05dbbec3704d58243e053c283068bdc7bd605f695cffd253f6dde32347a4d4d7fa4d4352fc2ce2117f599ec55ed"

RPROVIDES:${PN} += "python3.9dist(protobuf) python39-protobuf python39-protobuf(aarch-64) python3dist(protobuf)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
