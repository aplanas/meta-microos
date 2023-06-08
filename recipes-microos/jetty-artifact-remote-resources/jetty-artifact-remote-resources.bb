SUMMARY = "Jetty toolchain artifact remote resources"
DESCRIPTION = "Jetty toolchain artifact remote resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-artifact-remote-resources-1.2-2.10.noarch.rpm"
RPM_HASH = "3791ae1bb37acdaa7442603eeadaee03974cc88386b1185e5656da4d7ccf29a0ba9528c12974448cc501726151035369501b2b1a19a19d7012891902c8619bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-artifact-remote-resources mvn(org.eclipse.jetty.toolchain:jetty-artifact-remote-resources) mvn(org.eclipse.jetty.toolchain:jetty-artifact-remote-resources:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
