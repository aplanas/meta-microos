SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python310-hetzner-0.8.3-1.9.noarch.rpm"
RPM_HASH = "d11e07928de5acb461cb81fc3e8b39214313907664fd8d0598f73cdbc779498e6829946571783d2f0ef870139f3af47fa44b64da9ea0c02f0da1179e161b4a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hetzner python3.10dist(hetzner) python310-hetzner python3dist(hetzner)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
