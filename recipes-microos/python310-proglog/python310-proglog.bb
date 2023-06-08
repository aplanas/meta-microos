SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python310-proglog-0.1.9-1.15.noarch.rpm"
RPM_HASH = "acc12f6c079728e19b77e2985a0f3fe08c6c6d5120a03ef2c63d710741051240d3b5025bd4d061d2f8199e7f45f08d669a0e84c5f5d82998f5b06cc82faad92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proglog python3.10dist(proglog) python310-proglog python3dist(proglog)"
RDEPENDS:${PN} += "python(abi) python310-tqdm"

inherit rpm
