SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-paramiko-expect-0.3.4-1.3.noarch.rpm"
RPM_HASH = "c18eb42d706fdeb8434fd14844e044d54b9820e23fb9a44bf9b7e332fb995d1dd6e2c137482d877fcb7909394857e6a1256ebd57004ac772a705b178604c2ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko-expect python3.10dist(paramiko-expect) python310-paramiko-expect python3dist(paramiko-expect)"
RDEPENDS:${PN} += "python(abi) python310-paramiko"

inherit rpm
