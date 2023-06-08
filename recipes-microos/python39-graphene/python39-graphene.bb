SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-graphene-3.2.1-2.2.noarch.rpm"
RPM_HASH = "89733ab6316afabf99e0f46e798316ca1c268be3e69800c4c4affce3d5a9280b44ab4703b2ae6f104d85949b87ea44589336b25f727124fe497f7f263afaccda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(graphene) python39-graphene python3dist(graphene)"
RDEPENDS:${PN} += "python(abi) python39-aniso8601 python39-graphql-core python39-graphql-relay"

inherit rpm
