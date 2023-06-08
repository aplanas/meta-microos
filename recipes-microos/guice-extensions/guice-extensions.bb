SUMMARY = "Extensions for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides extensions POM for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-extensions-5.1.0-1.1.noarch.rpm"
RPM_HASH = "44f2d0957fae756e73cc95ee976498f2b3b4880fbff388ba20f299efee71d4c76b294238d85f5d032b7ce7aa86f00028e26dd80a2d274622b283c212f729e471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-extensions mvn(com.google.inject.extensions:extensions-parent:pom:) mvn(org.sonatype.sisu.inject:extensions-parent:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
