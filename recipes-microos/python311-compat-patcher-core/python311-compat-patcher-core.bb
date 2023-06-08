SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python311-compat-patcher-core-2.1-1.3.noarch.rpm"
RPM_HASH = "72261a8ad6cfd5d8f738511895752fc2c058f87e1168d278391501dd84497cecea43ceecf9c2819bfe32942bd9a1834868d3a048e620f6d6266f47238c3544de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(compat-patcher-core) python311-compat-patcher-core python3dist(compat-patcher-core)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
