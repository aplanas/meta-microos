SUMMARY = "SLF4J Extensions Module"
DESCRIPTION = "Extensions to the SLF4J API."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-ext-1.7.36-3.3.noarch.rpm"
RPM_HASH = "63a71242ffe3a9f7e891a5482cdaf64b8d07b2be07953cdde8a612620a8db05288e76585f9a32afe2a463264de0151e74cda618d9a1f74bfdda3c93c353c60c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-ext) mvn(org.slf4j:slf4j-ext:pom:) osgi(slf4j.ext) slf4j-ext"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm
