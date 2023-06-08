SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-paramiko-expect-0.3.4-1.3.noarch.rpm"
RPM_HASH = "fc6f04168a17b10fe9cc87027022e204cbe3bcb5de324aeaea449249dfa0504abb93fd7efd4edd91875762d4dac8f2f95e2f0eeabd3cc5d494233c1f81ac3c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paramiko-expect) python311-paramiko-expect python3dist(paramiko-expect)"
RDEPENDS:${PN} += "python(abi) python311-paramiko"

inherit rpm
