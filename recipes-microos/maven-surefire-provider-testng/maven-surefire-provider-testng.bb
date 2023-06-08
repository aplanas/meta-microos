SUMMARY = "TestNG provider for Maven Surefire"
DESCRIPTION = "TestNG provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-provider-testng-2.22.0-8.1.noarch.rpm"
RPM_HASH = "2fdc7ccadf1bb5699d8e51169b76982ba0cb48385d6bc5dc35796ec94354691f874c5e408630b616fbc3d46c03949857128217dda82b301593b4e1ba700ebc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-testng mvn(org.apache.maven.surefire:surefire-testng) mvn(org.apache.maven.surefire:surefire-testng-utils) mvn(org.apache.maven.surefire:surefire-testng-utils:pom:) mvn(org.apache.maven.surefire:surefire-testng:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven.surefire:common-java5) mvn(org.apache.maven.surefire:surefire-api) mvn(org.apache.maven.surefire:surefire-grouper)"

inherit rpm
