SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-genson-1.2.2-2.13.noarch.rpm"
RPM_HASH = "4de6f5bb0273f41075a7f0de2ddd68ff651eaf53a465c4b5dc0ff76a85409afe14c85f7339029d20297eaa44b40113d161a82d79440500d9967327ccb7cc281b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(genson) \
python39-genson \
python3dist(genson)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi)"

inherit rpm
