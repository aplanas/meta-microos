SUMMARY = "XML Schemas for Jetty"
DESCRIPTION = "XML Schemas for Jetty."
LICENSE = "(Apache-2.0 | EPL-1.0) & (CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "4.0.3"

RPM_NAME = "jetty-schemas-4.0.3-1.20.noarch.rpm"
RPM_HASH = "e467ce0be537b84e185aab9b4823899499e1608c202e04f5ab27e8db4cb48819203d53153089ac614cf05802228fa5f0a99c3d0d7abb438da1b917377672bd05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-schemas mvn(org.eclipse.jetty.toolchain:jetty-schemas) mvn(org.eclipse.jetty.toolchain:jetty-schemas:pom:) osgi(org.eclipse.jetty.schemas)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
