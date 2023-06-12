SUMMARY = "API documentation for jgit"
DESCRIPTION = "API documentation for jgit."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "jgit-javadoc-5.11.0-7.1.noarch.rpm"
RPM_HASH = "f8b5371ca665943d7649f165357d399faaa25b99ecb64eba1343b732fe355680be35f8d62f359abcae6947513e50f4122b254334f4e37bd719338fa26180ad72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgit-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
