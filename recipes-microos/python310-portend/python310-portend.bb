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

RPM_NAME = "python310-portend-3.1.0-2.1.noarch.rpm"
RPM_HASH = "be97aadb94c54160812e334324a83872f7ab553649eb79f7c08b507530014b52b5b46e249cd16113f2ec7784c23b465e524255c44624ec18d6cbecb541d84e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portend python3.10dist(portend) python310-portend python3dist(portend)"
RDEPENDS:${PN} += "python(abi) python310-tempora"

inherit rpm
