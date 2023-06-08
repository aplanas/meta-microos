SUMMARY = "Jackson module to inject OSGI services in deserialized beans"
DESCRIPTION = "This module provides a way to inject OSGI services into deserialized objects. \
Thanks to the JacksonInject annotations, the OsgiJacksonModule will search for \
the required service in the OSGI service registry and injects it in the object \
while deserializing."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-osgi-2.13.3-1.7.noarch.rpm"
RPM_HASH = "49b1965e4e6983886b512700673cb9d7e1a10b2b97689003687e6800ee3bbd8fb9c8f42e62d67c9a30a753dd1ec3037d8469b2da8a128bb5abfc2f847ea0dd1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-osgi mvn(com.fasterxml.jackson.module:jackson-module-osgi) mvn(com.fasterxml.jackson.module:jackson-module-osgi:pom:) osgi(com.fasterxml.jackson.module.jackson-module-osgi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.fasterxml.jackson.core:jackson-databind) mvn(org.osgi:osgi.core)"

inherit rpm
