SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python311-graphql-core-3.2.3-1.3.noarch.rpm"
RPM_HASH = "776d77c3c415feec3a5017848679014a58dbe81bb077b083f6c2aa4c81f5e4b17ff11cc0b86b463164ee1b68e1e40bedae6caea2fe8878fe97426f4b17feace3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(graphql-core) \
python311-graphql-core \
python3dist(graphql-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
