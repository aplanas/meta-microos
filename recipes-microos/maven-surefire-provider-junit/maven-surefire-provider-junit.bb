SUMMARY = "JUnit provider for Maven Surefire"
DESCRIPTION = "JUnit provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-junit-2.22.0-8.1.noarch.rpm"
RPM_HASH = "70e0f533084ab7c77177cb89a0e8ce16600462269bee6878667b8db4f26d53bb749a136098e2ee1c3352334f4c0c325846faf3f72f9d425f2439a263ea8992de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit mvn(org.apache.maven.surefire:common-junit3) mvn(org.apache.maven.surefire:common-junit3:pom:) mvn(org.apache.maven.surefire:common-junit4) mvn(org.apache.maven.surefire:common-junit48) mvn(org.apache.maven.surefire:common-junit48:pom:) mvn(org.apache.maven.surefire:common-junit4:pom:) mvn(org.apache.maven.surefire:surefire-junit3) mvn(org.apache.maven.surefire:surefire-junit3:pom:) mvn(org.apache.maven.surefire:surefire-junit4) mvn(org.apache.maven.surefire:surefire-junit47) mvn(org.apache.maven.surefire:surefire-junit47:pom:) mvn(org.apache.maven.surefire:surefire-junit4:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven.surefire:common-java5) mvn(org.apache.maven.surefire:surefire-api) mvn(org.apache.maven.surefire:surefire-grouper)"

inherit rpm
