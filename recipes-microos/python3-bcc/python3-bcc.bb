SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-bcc-0.26.0-2.8.noarch.rpm"
RPM_HASH = "61b514eb8bf6b3854800a60cc0d2ba88c494466d8d0c4fffc8c89cb15807bd5abff09b0fb09215b51cd19579a71817f740581e593ba023439d726e6e49a55c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bcc python3.10dist(bcc) python3dist(bcc)"
RDEPENDS:${PN} += "libbcc0 python(abi)"

inherit rpm
