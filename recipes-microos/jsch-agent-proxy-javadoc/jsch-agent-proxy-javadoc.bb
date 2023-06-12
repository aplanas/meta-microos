SUMMARY = "API documentation for jsch-agent-proxy"
DESCRIPTION = "This package provides API documentation for jsch-agent-proxy."
LICENSE = "BSD-3-Clause"

PV = "0.0.7"

RPM_NAME = "jsch-agent-proxy-javadoc-0.0.7-4.6.noarch.rpm"
RPM_HASH = "71362fd406f7167e150087793f4fc6d4e3994bcfe27aa48b47af6c4abe79f250a3b6d8c2bc6ee0fa8c6428638d9f4c440fb0c8047189521d924072efe68e58a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-agent-proxy-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem \
mvn(com.jcraft:jsch.agentproxy.core)"

inherit rpm
