SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python311-entrypoint2-1.1-1.3.noarch.rpm"
RPM_HASH = "73a52696f34d5e00991d32ea951484904fac2fb50ba48ce95f005f8fc48907e762acdfa40333d29dbb24df742dd773f70651fa9536941674c7506d1236691080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(entrypoint2) python311-entrypoint2 python3dist(entrypoint2)"
RDEPENDS:${PN} += "python(abi) python311-EasyProcess python311-decorator python311-path.py"

inherit rpm
