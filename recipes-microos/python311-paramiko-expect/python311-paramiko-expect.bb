SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python311-paramiko-expect-0.3.5-1.1.noarch.rpm"
RPM_HASH = "c9b3928504768945755e0bf77fe3b2ac135555830ee1199601faefeb70ba880b235731dca6e02220876c22dc3473050ead01d6fdc83259ba4275afd9ee8ad291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paramiko-expect) python311-paramiko-expect python3dist(paramiko-expect)"
RDEPENDS:${PN} += "python(abi) python311-paramiko"

inherit rpm
