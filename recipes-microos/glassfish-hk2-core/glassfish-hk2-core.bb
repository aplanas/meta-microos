SUMMARY = "HK2 core module"
DESCRIPTION = "Hundred Kilobytes Kernel core module."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-core-2.5.0-2.3.noarch.rpm"
RPM_HASH = "143c8e63f5832567f4d8816544b3c725d456da499cf082458217ef92630bd1da1d6d4cab463ac2186724388838d290f64c3c9614cb766e5f9c4107d8c01099b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-core mvn(org.glassfish.hk2:hk2-core) mvn(org.glassfish.hk2:hk2-core:pom:) osgi(org.glassfish.hk2.core)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.glassfish.hk2:hk2-locator) mvn(org.glassfish.hk2:hk2-utils)"

inherit rpm
