SUMMARY = "Jetty toolchain artifact for distribution remote resources"
DESCRIPTION = "Jetty toolchain artifact for distribution remote distribution resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-distribution-remote-resources-1.2-2.10.noarch.rpm"
RPM_HASH = "5a5ec2db77aa33886e430bd50f81e2c99fcf362d72503667a2084670cc955e9d274e42ad0b94cb0ffe3ed81398adbb156f075529a7fd95c867f98cd341aa695f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-distribution-remote-resources \
mvn(org.eclipse.jetty.toolchain:jetty-distribution-remote-resources) \
mvn(org.eclipse.jetty.toolchain:jetty-distribution-remote-resources:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
