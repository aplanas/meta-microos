SUMMARY = "Plexus Velocity Component"
DESCRIPTION = "This package provides Plexus Velocity component - a wrapper for \
Apache Velocity template engine, which allows easy use of Velocity \
by applications built on top of Plexus container."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "plexus-velocity-1.2-4.6.noarch.rpm"
RPM_HASH = "2192d2516ee0dea195ddf48a85a4404c378ca8f59bb7a3e319f69dfd9aa75522addc17462f8f78045c4f5b973b0985fee2ba6314b0e05041433e9c535f1882f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-velocity) mvn(org.codehaus.plexus:plexus-velocity:pom:) plexus-velocity"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-collections:commons-collections) mvn(org.apache.velocity:velocity) mvn(org.codehaus.plexus:plexus-container-default) mvn(velocity:velocity)"

inherit rpm
