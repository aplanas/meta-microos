SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-graphql-relay-3.2.0-1.4.noarch.rpm"
RPM_HASH = "2150b452daad05b139fa4a564c4d07a0ebac03e4b6787d816b01209572c59f181eaec7708d9a6542d2b05bb183937ae94c3bbc14780a46dda890ac7255fd9abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-relay python3.10dist(graphql-relay) python310-graphql-relay python3dist(graphql-relay)"
RDEPENDS:${PN} += "(python310-graphql-core >= 3.2) python(abi) python310-promise"

inherit rpm
