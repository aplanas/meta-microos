SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python39-coreapi-2.3.3-1.22.noarch.rpm"
RPM_HASH = "0c55fc075c8e207be0b71494d76cadee362358e2ad0753c447392e87c61216a05d866616c504e739c766bb582609f33f4ccabbd59d11ca5a0c25bc5b3f8d2fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(coreapi) \
python39-coreapi \
python3dist(coreapi)"
RDEPENDS:${PN} += "python(abi) \
python39-coreschema \
python39-itypes \
python39-requests \
python39-uritemplate"

inherit rpm
