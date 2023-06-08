SUMMARY = "HK2 API module"
DESCRIPTION = "Hundred Kilobytes Kernel API module."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-api-2.5.0-2.3.noarch.rpm"
RPM_HASH = "f00dd1da48fab3e9742ba9012280489bd3907aca91271b9fbeff87c96b8ac375ff8a76fa890d6d96626d8598c1cfed719440c76dd713d241bcb13d6663a6a797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-api mvn(org.glassfish.hk2:hk2-api) mvn(org.glassfish.hk2:hk2-api:pom:) osgi(org.glassfish.hk2.api)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(aopalliance:aopalliance) mvn(javax.inject:javax.inject) mvn(org.glassfish.hk2:hk2-utils)"

inherit rpm
