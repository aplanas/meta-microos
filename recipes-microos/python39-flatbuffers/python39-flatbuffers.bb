SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python39-flatbuffers-23.3.3-2.1.noarch.rpm"
RPM_HASH = "7613627b4ad781fa377d1576e576bd94057ca9bbbc89c98661d974e7d13fbe85835be94ca1f27fb4ece569f48fa1331d945c7094ed61237c86051e1068b16929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flatbuffers) python39-flatbuffers python3dist(flatbuffers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
