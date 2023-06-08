SUMMARY = "Coordination library for distributed systems"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "python3-tooz-2.11.1-2.4.noarch.rpm"
RPM_HASH = "f9db867e21cc16dc97a69efd2a1179d8b98f87428481336361f460e9e8f928e75ec35a7c78d5a7a90a7578bbde29f8620353c10b6c377446c8a1039d653de7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tooz python3.10dist(tooz) python3dist(tooz)"
RDEPENDS:${PN} += "python(abi) python3-fasteners python3-futurist python3-msgpack python3-oslo.serialization python3-oslo.utils python3-stevedore python3-tenacity python3-voluptuous"

inherit rpm
