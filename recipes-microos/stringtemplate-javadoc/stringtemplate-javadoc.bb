SUMMARY = "API documentation for stringtemplate"
DESCRIPTION = "API documentation for package stringtemplate."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-javadoc-3.2.1-2.6.noarch.rpm"
RPM_HASH = "42178a0c065c922c1324305af05e1abe01f7de0a574ee418b1999d103b850c3b1c8e4a5bda0c3a36152749d7a65881a8c5108f1c60fd9439f9657e337ba80e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate-javadoc"
RDEPENDS:${PN} += "java-javadoc \
javapackages-filesystem"

inherit rpm
