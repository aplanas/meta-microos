SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python311-linecache2-1.0.0-6.1.noarch.rpm"
RPM_HASH = "de25b4c755df1a71a591d84dafdd7d82b2104bdabe9231006896cb7e6cc097f7672360c7c554132386b0dee5c7eee5b65082465eb1da38f63686f1e842b0f4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(linecache2) python311-linecache2 python3dist(linecache2)"
RDEPENDS:${PN} += "python(abi) python311-pbr"

inherit rpm
