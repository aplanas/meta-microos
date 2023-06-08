SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python310-graphql-core-3.2.3-1.3.noarch.rpm"
RPM_HASH = "01a6445b8dacd3f42319c555b6f1839b083e09ff9c01cfb242eb2b46408768ce763fc4ddf9efd565c52e775e3e825c0ce25c68743d8baef1df356b2be576ff7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-core python3.10dist(graphql-core) python310-graphql-core python3dist(graphql-core)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
