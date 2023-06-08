SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.0"

RPM_NAME = "python310-filelock-3.12.0-1.1.noarch.rpm"
RPM_HASH = "40bedc8e7771a5153c0257947dbe1fa1efbc65667c396dc82f27c5e552e30828fe96f9b0db80622bc9998f9302188da94995ea37f2a4c5c294fb19cfff52ec9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filelock python3.10dist(filelock) python310-filelock python3dist(filelock)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
