SUMMARY = "USocketFactory implementation using JNA"
DESCRIPTION = "USocketFactory implementation using JNA."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-usocket-jna-0.0.7-4.6.noarch.rpm"
RPM_HASH = "cbf62654c7af11ecff6a346ea03c1cc1902909664e9f754bb770dc7b7cf9bb91315661cb2463db000b9e5df8a43a15cc62e3283dd0cc6d7e5d40599a86c3e26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-usocket-jna \
mvn(com.jcraft:jsch.agentproxy.usocket-jna) \
mvn(com.jcraft:jsch.agentproxy.usocket-jna:pom:) \
osgi(com.jcraft.jsch.agentproxy.usocket-jna)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jsch.agentproxy.core) \
mvn(net.java.dev.jna:jna) \
mvn(net.java.dev.jna:platform)"

inherit rpm
