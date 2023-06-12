SUMMARY = "Apache OpenNLP Maxent"
DESCRIPTION = "This package provides Apache OpenNLP Maxent."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-maxent-1.5.3-3.10.noarch.rpm"
RPM_HASH = "8c3a8bbd9811b772f2abe44d003cac360190d5faa1ae5f0c8b2ebb45322278df3fdd8647785cbacca21e2e64c08c74cfd0e9148bc0e4040f2cd7f5ba9ba567c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.opennlp:opennlp-maxent) \
mvn(org.apache.opennlp:opennlp-maxent:pom:) \
opennlp-maxent \
osgi(org.apache.opennlp.maxent)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
