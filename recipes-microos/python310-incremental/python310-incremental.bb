SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-incremental-22.10.0-2.1.noarch.rpm"
RPM_HASH = "b662d784e4b49e3547cd238b14767f0b5d41e52bcf8e0ffde5ae61e5c89ee40eefc27d7ce955a135092b4f30d52a39c31211511cd9586f5fd8b7dd8aec3bb67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-incremental python3.10dist(incremental) python310-incremental python3dist(incremental)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
