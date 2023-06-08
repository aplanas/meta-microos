SUMMARY = "JUnit 5 (Bill of Materials)"
DESCRIPTION = "This Bill of Materials POM can be used to ease dependency management \
when referencing multiple JUnit artifacts using Gradle or Maven."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-bom-5.8.2-1.9.noarch.rpm"
RPM_HASH = "1fa331d2f60127bd4efe3babb819e889a0c7d3231b98739ca1f27612d06d5c1c5e6e2465d6b61f3e417380ad3277058c8cb55ceffa6050f599fd52a5b00c1642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-bom mvn(org.junit:junit-bom:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
