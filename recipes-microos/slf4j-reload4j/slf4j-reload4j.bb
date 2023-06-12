SUMMARY = "SLF4J LOG4J-12 Binding"
DESCRIPTION = "SLF4J LOG4J-12 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-reload4j-1.7.36-4.1.noarch.rpm"
RPM_HASH = "b83b6b29cc8ae3c63228af3a8da076aaa784717952feaff85d7e1f4eb8d04a4c4fa0d6033fec5db88bf2e774c22c06b57724ddc81a1863c5b2e533fc6eb04a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-log4j12) mvn(org.slf4j:slf4j-log4j12:pom:) mvn(org.slf4j:slf4j-reload4j) mvn(org.slf4j:slf4j-reload4j:pom:) osgi(slf4j.reload4j) slf4j-log4j12 slf4j-reload4j"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(ch.qos.reload4j:reload4j) mvn(org.slf4j:slf4j-api)"

inherit rpm
