SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python310-linecache2-1.0.0-6.1.noarch.rpm"
RPM_HASH = "3e6c59ce270a88dca205245aa23408c2b6a23d071c79d8bc49fbe1f6e82cfcb01f771f3f06955e490a81c6ee59cd4a2db042438cf16aae4f3a4a75a22e89661e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linecache2 python3.10dist(linecache2) python310-linecache2 python3dist(linecache2)"
RDEPENDS:${PN} += "python(abi) python310-pbr"

inherit rpm
