SUMMARY = "Connector factory for jsch-agent-proxy"
DESCRIPTION = "Connector factory for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-connector-factory-0.0.7-4.6.noarch.rpm"
RPM_HASH = "41d32932648d3bff4125b621efdee1ad9907de88468437c22d07f0bb5c90a209f9c69a9021ee56a79af8937981b217a306a9b962f4bcc29d98ed3b520dafb070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-connector-factory mvn(com.jcraft:jsch.agentproxy.connector-factory) mvn(com.jcraft:jsch.agentproxy.connector-factory:pom:) osgi(com.jcraft.jsch.agentproxy.connector-factory)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.jcraft:jsch.agentproxy.core) mvn(com.jcraft:jsch.agentproxy.pageant) mvn(com.jcraft:jsch.agentproxy.sshagent) mvn(com.jcraft:jsch.agentproxy.usocket-jna) mvn(com.jcraft:jsch.agentproxy.usocket-nc)"

inherit rpm
