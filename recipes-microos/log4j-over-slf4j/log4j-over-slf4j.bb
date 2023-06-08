SUMMARY = "Log4j implemented over SLF4J"
DESCRIPTION = "Log4j implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "log4j-over-slf4j-1.7.36-3.3.noarch.rpm"
RPM_HASH = "fcd3879c78eced1c4b73056ede532adf2c98ff028521a9af2fb1a2fe8141ee4f8b3258d00bb3973bdb43f8956f02851dd858edb43d74a05e2728eef4d09469f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-over-slf4j mvn(org.slf4j:log4j-over-slf4j) mvn(org.slf4j:log4j-over-slf4j:pom:) osgi(log4j.over.slf4j)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm
