SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-dash-core-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "4a4863c879a28ac26dd3aaf4f96c80462986d45a4a7e30d8fa1f8f2303ca40c1da55a701efadf0d5664da8e841c0b152bd35f450cf6c7e8e7bf14de1e7d4e6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-core-components python3.10dist(dash-core-components) python310-dash-core-components python3dist(dash-core-components)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
