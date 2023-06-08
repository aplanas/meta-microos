SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-graphql-relay-3.2.0-1.4.noarch.rpm"
RPM_HASH = "808fbee992f5882a339b51cc29e5576f18d503aa71f06e37d8e2cdff96031fa6ac95743252be4e98bd056755d40fd9c6f0edc5129dea53ecc5f0831905757f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(graphql-relay) python39-graphql-relay python3dist(graphql-relay)"
RDEPENDS:${PN} += "(python39-graphql-core >= 3.2) python(abi) python39-promise"

inherit rpm
