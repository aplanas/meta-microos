SUMMARY = "Pageant connector for jsch-agent-proxy"
DESCRIPTION = "Pageant connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-pageant-0.0.7-4.6.noarch.rpm"
RPM_HASH = "05ce7690049713f82da017e95c018c9650d5b7045acf5bf648d2cea96ca65e2219d88253c5096732137b54cca8950af8cc0d63fcc0ce6c192972987659fce9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-pageant \
mvn(com.jcraft:jsch.agentproxy.pageant) \
mvn(com.jcraft:jsch.agentproxy.pageant:pom:) \
osgi(com.jcraft.jsch.agentproxy.pageant)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jsch.agentproxy.core) \
mvn(net.java.dev.jna:jna) \
mvn(net.java.dev.jna:platform)"

inherit rpm
