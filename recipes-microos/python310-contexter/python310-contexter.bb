SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python310-contexter-0.1.4-2.14.noarch.rpm"
RPM_HASH = "7adf8ad5e40973188e5a3b84cebde1e5e45a0a3fcbe606a631701a8dafc4d81599570950a2a18ea5f0accafb97383f3df5e6b252a18ded067b390f997de00585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contexter python3.10dist(contexter) python310-contexter python3dist(contexter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
