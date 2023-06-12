SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.2"

RPM_NAME = "python311-distroinfo-0.6.2-1.2.noarch.rpm"
RPM_HASH = "4e09825b01f29e0c57e697bfd8324edb6816ecc9ae2bb6b26bc140f84af95e0601fec27d21cf3c0c323d7a9720ad01e08ab1f85f91218e20c6e3965ed6ea2403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(distroinfo) \
python311-distroinfo \
python3dist(distroinfo)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-pbr \
python311-requests \
python311-six"

inherit rpm
