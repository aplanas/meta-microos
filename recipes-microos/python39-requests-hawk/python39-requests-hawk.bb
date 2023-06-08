SUMMARY = "Hawk authentication strategy for the requests python library"
DESCRIPTION = "This project allows you to use the python requests library with the hawk \
authentification mechanism. \
 \
Hawk itself does not provide any mechanism for obtaining or transmitting the \
set of shared credentials required, but this project proposes a scheme we use \
across mozilla services projects."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-requests-hawk-1.2.1-1.1.noarch.rpm"
RPM_HASH = "6a446a98e39b5b41a514f792e3f6b78f1622c6fc7a921ab6a2608107a05acd2931eccba90eef961399f01983cea1e32b5258b8612a12e61a4659dd46b708c221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-hawk) python39-requests-hawk python3dist(requests-hawk)"
RDEPENDS:${PN} += "python(abi) python39-mohawk python39-requests"

inherit rpm
