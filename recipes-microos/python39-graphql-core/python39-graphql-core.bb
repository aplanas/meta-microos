SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python39-graphql-core-3.2.3-1.3.noarch.rpm"
RPM_HASH = "6d96e885c62f96dee991c04f1fcbeb09e0533da66f2c12d045190adcc3d4ca7d9ff66790884f07a74bd0677c8fbfcce21e17e040047b40db07f20784c5ec56c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(graphql-core) \
python39-graphql-core \
python3dist(graphql-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
