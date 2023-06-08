SUMMARY = "SLF4J LOG4J-12 Binding"
DESCRIPTION = "SLF4J LOG4J-12 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-reload4j-1.7.36-3.3.noarch.rpm"
RPM_HASH = "1ae4dca9b0cac68c3844991ba65f6ebd7fd310b03f845aa8914f1f008ba7f28f4f718d32cdb6d14c00fc61dd5e0d3a1a7a6db23e93d4b8c4f36d909ca6759f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-log4j12) mvn(org.slf4j:slf4j-log4j12:pom:) mvn(org.slf4j:slf4j-reload4j) mvn(org.slf4j:slf4j-reload4j:pom:) osgi(slf4j.reload4j) slf4j-log4j12 slf4j-reload4j"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(ch.qos.reload4j:reload4j) mvn(org.slf4j:slf4j-api)"

inherit rpm
