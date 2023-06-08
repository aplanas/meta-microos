SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python311-sarge-0.1.7.post1-1.3.noarch.rpm"
RPM_HASH = "3c11393f39f2d942ec00df700e9e8a5fa16feb71fde5faa66f0d263b3a241cba26715abec4c2aa777a20ab70f13f1be4e9152a8da3968fe6877387bd049a7660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sarge) python311-sarge python3dist(sarge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
