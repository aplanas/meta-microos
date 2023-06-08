SUMMARY = "Apache Log4j Commons Logging Bridge"
DESCRIPTION = "Apache Log4j Commons Logging Bridge."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-jcl-2.17.2-5.7.noarch.rpm"
RPM_HASH = "3b0fb4e28556c668b0db8fe4367415c9f483a8488b1669eb966f28e7d84f839b65794304870c57a15ffd08dc3e3852687cef0ee9d13d51a8506aa4a71219246b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-jcl mvn(org.apache.logging.log4j:log4j-jcl) mvn(org.apache.logging.log4j:log4j-jcl:pom:) osgi(org.apache.logging.log4j.jcl)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-logging:commons-logging) mvn(org.apache.logging.log4j:log4j-api)"

inherit rpm
