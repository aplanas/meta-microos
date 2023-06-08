SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-paramiko-expect-0.3.4-1.3.noarch.rpm"
RPM_HASH = "5ffcf3feec2c0abf0039a71e8620b6e9a5d3aebf5382b562999cf19ef598436e7ac71558e0ef8d2be83c2ff57591cf2cf1067eeb6e6fac283efc6a423ee09802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paramiko-expect) python39-paramiko-expect python3dist(paramiko-expect)"
RDEPENDS:${PN} += "python(abi) python39-paramiko"

inherit rpm
