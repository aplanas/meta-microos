SUMMARY = "TCP port monitoring utilities"
DESCRIPTION = "Use portend to monitor TCP ports for bound or unbound states. \
 \
The portend may also be executed directly. If the function succeeds, it \
returns nothing and exits with a status of 0. If it fails, it prints a \
message and exits with a status of 1. For example:: \
 \
Portend also exposes a ``find_available_local_port`` for identifying \
a suitable port for binding locally::"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-portend-3.1.0-2.1.noarch.rpm"
RPM_HASH = "519ba19e3d89e431a9c7241eb990e45709910a07bb6ee927e3f5e1d803f8d2ad8677c599c961ee893f7399cd094dbf4dd2191deb254bd069f004322f517dbeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(portend) python311-portend python3dist(portend)"
RDEPENDS:${PN} += "python(abi) python311-tempora"

inherit rpm
