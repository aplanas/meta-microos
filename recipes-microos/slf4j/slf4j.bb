SUMMARY = "Simple Logging Facade for Java"
DESCRIPTION = "The Simple Logging Facade for Java or (SLF4J) is intended to serve \
as a simple facade for various logging APIs allowing to the end-user \
to plug in the desired implementation at deployment time. SLF4J also \
allows for a gradual migration path away from \
Jakarta Commons Logging (JCL). \
 \
Logging API implementations can either choose to implement the \
SLF4J interfaces directly, e.g. NLOG4J or SimpleLogger. Alternatively, \
it is possible (and rather easy) to write SLF4J adapters for the given \
API implementation, e.g. Log4jLoggerAdapter or JDK14LoggerAdapter.."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-1.7.36-3.3.noarch.rpm"
RPM_HASH = "a33c4021edaae4a1768168e32dde711b56988dc1aa2e8071ec3c13212a8d20c84afebc0dca75370276c6e289950295ebea0cb3fb238a2219641c2b0c9b2136ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-api) mvn(org.slf4j:slf4j-api:pom:) mvn(org.slf4j:slf4j-nop) mvn(org.slf4j:slf4j-nop:pom:) mvn(org.slf4j:slf4j-simple) mvn(org.slf4j:slf4j-simple:pom:) osgi(slf4j.api) osgi(slf4j.nop) osgi(slf4j.simple) slf4j"
RDEPENDS:${PN} += "cal10n java java-headless javapackages-filesystem"

inherit rpm
