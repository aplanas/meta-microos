SUMMARY = "Apache Log4j JMX GUI"
DESCRIPTION = "Swing-based client for remotely editing the log4j configuration and remotely \
monitoring StatusLogger output. Includes a JConsole plug-in."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-jmx-gui-2.17.2-5.7.noarch.rpm"
RPM_HASH = "3624ba997feb2006c3168f24586a5644f3143dceb1321c859357d4b403e80128b954c853628e5bacd2c5d9994d963f9d29650af256229f660e30ec1210e6f135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-jmx-gui mvn(org.apache.logging.log4j:log4j-jmx-gui) mvn(org.apache.logging.log4j:log4j-jmx-gui:pom:) osgi(org.apache.logging.log4j.jmx-gui)"
RDEPENDS:${PN} += "/bin/bash java-devel java-headless javapackages-filesystem mvn(org.apache.logging.log4j:log4j-api) mvn(org.apache.logging.log4j:log4j-core)"

inherit rpm
