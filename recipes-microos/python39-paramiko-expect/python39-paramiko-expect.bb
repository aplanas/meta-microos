SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python39-paramiko-expect-0.3.5-1.1.noarch.rpm"
RPM_HASH = "9a58ecab2680a9d9adee0e3fe55fa22b4baf47a328d054193bd16624a93f5f433d445d3f9af4d868483760b09571555e2a400c5d4645314fb32777e75c925e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paramiko-expect) python39-paramiko-expect python3dist(paramiko-expect)"
RDEPENDS:${PN} += "python(abi) python39-paramiko"

inherit rpm
