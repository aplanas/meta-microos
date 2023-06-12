SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-proglog-0.1.10-1.1.noarch.rpm"
RPM_HASH = "469c3adefb290b5fd09a61375efefd900b975e5a2de0b646eceded6d3cdf4139f0b791a6af5a8e61db41c0d50188bfb9fed0df92a858344241b2ddc699dcfba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(proglog) python311-proglog python3dist(proglog)"
RDEPENDS:${PN} += "python(abi) python311-tqdm"

inherit rpm
