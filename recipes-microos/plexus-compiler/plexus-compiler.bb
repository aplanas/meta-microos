SUMMARY = "Compiler call initiators for Plexus"
DESCRIPTION = "Plexus Compiler adds support for using various compilers from a \
unified api. Support for javac is available in main package. For \
additional compilers see plexus-compiler-extras package."
LICENSE = "Apache-2.0 & MIT"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-2.11.1-3.4.noarch.rpm"
RPM_HASH = "3ef959a10f8f9f1a179f298854cb9343f13444a08225f98bfe6f3d3fa40317859dcb33745db543bbb74d8a04d60fc5a5d32ef8a057fdfdaa549a8305fb9bc9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-compiler-api) \
mvn(org.codehaus.plexus:plexus-compiler-api:pom:) \
mvn(org.codehaus.plexus:plexus-compiler-j2objc) \
mvn(org.codehaus.plexus:plexus-compiler-j2objc:pom:) \
mvn(org.codehaus.plexus:plexus-compiler-javac) \
mvn(org.codehaus.plexus:plexus-compiler-javac:pom:) \
mvn(org.codehaus.plexus:plexus-compiler-manager) \
mvn(org.codehaus.plexus:plexus-compiler-manager:pom:) \
plexus-compiler"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
