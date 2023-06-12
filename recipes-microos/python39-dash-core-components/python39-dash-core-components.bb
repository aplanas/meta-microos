SUMMARY = "Core component suite for Dash - Legacy"
DESCRIPTION = "Core component suite for Dash \
 \
As of Dash 2, the development of dash-core-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-dash-core-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "f6bfbf17be169f3c0b34e4dd3467386e1168cc7d25c9b0c57502d7489174c10611c35efe0b2f7741a69a6eac8c813d87086d33cb54c0494f26ff01067753eb67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dash-core-components) \
python39-dash-core-components \
python3dist(dash-core-components)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
