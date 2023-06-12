SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-mujson-1.4-2.15.noarch.rpm"
RPM_HASH = "460549e9b1e5b35cfb6ef42450d65fbc73207fb8eccc193c3e3ebde3df57dfa2d7ab64611672c17db9d5e0fd4653ced842f3b12fc3ebed9e4b2b72b31141c94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mujson) \
python39-mujson \
python3dist(mujson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
