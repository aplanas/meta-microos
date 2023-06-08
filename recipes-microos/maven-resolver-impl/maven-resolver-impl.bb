SUMMARY = "Maven Artifact Resolver Implementation"
DESCRIPTION = "An implementation of the repository system."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-impl-1.9.8-1.1.noarch.rpm"
RPM_HASH = "8e8ce059c6fefbb62f5eabff7d4210d7fe9fe1d2918a1cef098f510d8b0d354354adecb2d5cda8fcf3d214964167c7b2e3d038566d6d0f750536fe142cc9061a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-impl mvn(org.apache.maven.resolver:maven-resolver-impl) mvn(org.apache.maven.resolver:maven-resolver-impl:pom:) mvn(org.eclipse.aether:aether-impl) mvn(org.eclipse.aether:aether-impl:pom:) osgi(org.apache.maven.resolver.impl)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.resolver:maven-resolver-api) mvn(org.apache.maven.resolver:maven-resolver-named-locks) mvn(org.apache.maven.resolver:maven-resolver-spi) mvn(org.apache.maven.resolver:maven-resolver-util) mvn(org.slf4j:slf4j-api)"

inherit rpm
