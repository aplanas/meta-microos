SUMMARY = "Javadoc for maven-verifier"
DESCRIPTION = "API documentation for maven-verifier."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-javadoc-1.6-3.12.noarch.rpm"
RPM_HASH = "70c7c85b6bbb3e7610ad3632d771fffb8da6d16a6c600a9ac473b683c4d7c64947a666ba7528435869023151a5091b2afda163237f2b8ebd6d84a01e089dc68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
