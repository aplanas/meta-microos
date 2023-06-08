SUMMARY = "API documentation for maven"
DESCRIPTION = "API documentation for maven."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.1"

RPM_NAME = "maven-javadoc-3.9.1-1.1.noarch.rpm"
RPM_HASH = "a19c69d376eefff81de6f8e3c6bff91751f087a616ea9253243ff4ec69a711763ade564e34cce867d917995a464b0bd69f5faa1cb6b53d47902c44537afbe4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
