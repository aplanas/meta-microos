SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python39-pyleri-1.3.3-1.8.noarch.rpm"
RPM_HASH = "4a145a4f66b6b3d95313a412abf49bb4a61b57e86701b14eab47027b4d6a40122e5d6bbcb85782d94cd9c8bf7ee5d63fb8f43fa47a5500d5493fabfc22331a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyleri) python39-pyleri python3dist(pyleri)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
