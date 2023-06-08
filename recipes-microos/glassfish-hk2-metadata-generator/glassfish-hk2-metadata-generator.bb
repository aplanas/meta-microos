SUMMARY = "HK2 Metadata Generator"
DESCRIPTION = "HK2 Metadata Generator Subsystem."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-metadata-generator-2.5.0-2.3.noarch.rpm"
RPM_HASH = "0d34dced71574c6f38ed220e0d957b4b8b60984ea0faa9cae62629ae393f4bd31fa0931e1163694634fc19128cdab0259da5bc1e2bc1f9a589e5cbadc6ba8f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-metadata-generator mvn(org.glassfish.hk2:hk2-metadata-generator) mvn(org.glassfish.hk2:hk2-metadata-generator-parent:pom:) mvn(org.glassfish.hk2:hk2-metadata-generator:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.annotation:javax.annotation-api) mvn(javax.inject:javax.inject) mvn(org.glassfish.hk2:hk2-api) mvn(org.glassfish.hk2:hk2-utils)"

inherit rpm
