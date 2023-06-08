SUMMARY = "Graphene Django integration"
DESCRIPTION = "Graphene Django integration."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-graphene-django-3.0.0-1.4.noarch.rpm"
RPM_HASH = "b88d9a9731c178349cfbda9bcc788dbe27e1750d0c8532a4003b605ae4607382c64d28e49674da2f14192258263070d30cee8e1d78cd6404604c62b9f8d56219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(graphene-django) python311-graphene-django python3dist(graphene-django)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-graphene python311-graphql-core python311-graphql-relay python311-promise python311-six python311-text-unidecode"

inherit rpm
