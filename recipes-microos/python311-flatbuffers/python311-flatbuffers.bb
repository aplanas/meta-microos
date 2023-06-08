SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python311-flatbuffers-23.3.3-2.1.noarch.rpm"
RPM_HASH = "84dca5a4cbbaf35961b83fc17bc16581a52c497b5af639d04c138bc6d1ab509635fa0a674802adf7304266ed7e944ae948da562d1eabf7b1ec459b9c02ad6eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flatbuffers) python311-flatbuffers python3dist(flatbuffers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
