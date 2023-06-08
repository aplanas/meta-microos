SUMMARY = "Interfaces and Classes for use in compiling OSGi bundles"
DESCRIPTION = "OSGi Compendium, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-7.0.0-2.4.noarch.rpm"
RPM_HASH = "151cd3f64d616dbde60b89a313a3e0d2209b3ee850b82066e668d494b09f3a330a17acd92a77ff1007c0a8ecf16a6a09c79749e2aec1b52a01b37c4d087072e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.osgi:osgi.cmpn) mvn(org.osgi:osgi.cmpn:pom:) osgi(osgi.cmpn) osgi-compendium"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
