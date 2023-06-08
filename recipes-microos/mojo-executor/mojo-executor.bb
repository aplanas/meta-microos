SUMMARY = "Mojo Executor"
DESCRIPTION = "The Mojo Executor provides a way to to execute other Mojos (plugins) within a Maven plugin, \
allowing to create Maven plugins that are composed of other plugins."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-2.4.0-1.3.noarch.rpm"
RPM_HASH = "eaa39d879dc839d1f2223625735496efe53fa04b58782cf0b30019915d00041f9d22ffad2c2d5e0860599af6e2db6fb9d3a1379a71caa1d6a97c923897a98202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor mvn(org.twdata.maven:mojo-executor) mvn(org.twdata.maven:mojo-executor-parent:pom:) mvn(org.twdata.maven:mojo-executor:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
