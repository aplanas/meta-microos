SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python311-proglog-0.1.9-1.15.noarch.rpm"
RPM_HASH = "342abc791ffa79132901f51afcb2bd30acd87afc4dd993944c2e88ccaaff081d3bd15c07ac68d4ebd438f9c7ba6484797ee00cd902ce05a17b67ae8601a325da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proglog) python311-proglog python3dist(proglog)"
RDEPENDS:${PN} += "python(abi) python311-tqdm"

inherit rpm
