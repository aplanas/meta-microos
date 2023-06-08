SUMMARY = "Javadoc for maven-reporting-api"
DESCRIPTION = "API documentation for maven-reporting-api."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-api-javadoc-3.1.0-3.7.noarch.rpm"
RPM_HASH = "f5769a4db4a01857a53e82210575bb5de95c3046226e916946a4b0890d30309d48c38cdb4a54fa68a7491ba907e28de49d36e867fdcb0c0e5ecbe58e14dcfe25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
