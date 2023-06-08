SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python310-protobuf-21.12-3.1.aarch64.rpm"
RPM_HASH = "161df5a958368e4c9df80d65e15c829ff235d4d955bf1f883fa6d7f756a23004fd8d80534417f10d63f0b49a9152d96096b93307643546a131dfc078582cf728"

RPROVIDES:${PN} += "python3-protobuf python3.10dist(protobuf) python310-protobuf python310-protobuf(aarch-64) python3dist(protobuf)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
