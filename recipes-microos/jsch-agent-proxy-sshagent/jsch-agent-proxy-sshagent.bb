SUMMARY = "ssh-agent connector for jsch-agent-proxy"
DESCRIPTION = "ssh-agent connector for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-sshagent-0.0.7-4.6.noarch.rpm"
RPM_HASH = "36a7683906b99deddc626b0a136076bb2cb4314c0c0e5568f9a135c8c0eb200bdf0df472771ef675febff6ec39fadeb4d35855a276c846443f16a904d2dfedf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-sshagent mvn(com.jcraft:jsch.agentproxy.sshagent) mvn(com.jcraft:jsch.agentproxy.sshagent:pom:) osgi(com.jcraft.jsch.agentproxy.sshagent)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.jcraft:jsch.agentproxy.core)"

inherit rpm
