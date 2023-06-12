SUMMARY = "Javadoc for jetty-minimal"
DESCRIPTION = "Javadoc for jetty-minimal."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-minimal-javadoc-9.4.51-1.1.noarch.rpm"
RPM_HASH = "bc628d2e25127347c2def9c0a9fffc7d1523c207b8969ac9db078f37b29df1a1d1a832523957002796576e87577832992d4d28bd548a8d9a8afaba6ba7002157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-minimal-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
