SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-graphql-relay-3.2.0-1.4.noarch.rpm"
RPM_HASH = "35450ff7aa1cfacd859164b833bef4d1ca121b3883bdb9f16ef1bdae15280db4db6d3de677ec81389357e88051708bcb26cb1b7b32ba4d37b9499be62a990eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(graphql-relay) python311-graphql-relay python3dist(graphql-relay)"
RDEPENDS:${PN} += "(python311-graphql-core >= 3.2) python(abi) python311-promise"

inherit rpm
