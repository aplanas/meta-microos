SUMMARY = "HK2 Implementation Utilities"
DESCRIPTION = "Hundred Kilobytes Kernel Implementation Utilities."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-utils-2.5.0-2.3.noarch.rpm"
RPM_HASH = "90ccec5e63a48a602fa4a761b85391eaf15520a597a0c3f524913fbd026b2483519d12f5ee52185fe9fe06af2a6e68a46d0cec20ea876f18e8c14ee191ab0514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-utils mvn(org.glassfish.hk2:hk2-utils) mvn(org.glassfish.hk2:hk2-utils:pom:) osgi(org.glassfish.hk2.utils)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.annotation:javax.annotation-api) mvn(javax.inject:javax.inject)"

inherit rpm
