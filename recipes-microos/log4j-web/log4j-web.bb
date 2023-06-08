SUMMARY = "Apache Log4j Web"
DESCRIPTION = "Support for Log4j in a web servlet container."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-web-2.17.2-5.7.noarch.rpm"
RPM_HASH = "d3cea65bb77b65f1150b53aff60a26ebeb962199d10aa6112a71d3af9e32627fdc16ca761e016255b45336d2cd65f1bee94f6df08ecc7816553d570e39c00766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-web mvn(org.apache.logging.log4j:log4j-web) mvn(org.apache.logging.log4j:log4j-web:pom:) osgi(org.apache.logging.log4j.web)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.logging.log4j:log4j-api) mvn(org.apache.logging.log4j:log4j-core)"

inherit rpm
