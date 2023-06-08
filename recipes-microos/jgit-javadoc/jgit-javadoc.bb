SUMMARY = "API documentation for jgit"
DESCRIPTION = "API documentation for jgit."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "jgit-javadoc-5.11.0-6.1.noarch.rpm"
RPM_HASH = "f407238ef53670763400f38885fc332961e3b220d1782724b3871dc6dd6ecef58c58e1a87678da2c22ba8703cc71ac5e91d0b943b969f621c59bafbaca21b872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgit-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
