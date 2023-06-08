SUMMARY = "Apache OpenNLP Tools"
DESCRIPTION = "This package provides Apache OpenNLP Tools."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-tools-1.5.3-3.10.noarch.rpm"
RPM_HASH = "ce6862a4974d9adaf7ab9136d533beafb27c2ed1c6830fdbe7aa6e7181ad5c7dbca4469be5279a16025dc6c7ad0bfb4ee2f043960d0eb5d64ae69fdd05e64fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.opennlp:opennlp-tools) mvn(org.apache.opennlp:opennlp-tools:pom:) opennlp-tools osgi(org.apache.opennlp.tools)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(net.sf.jwordnet:jwnl) mvn(org.apache.opennlp:opennlp-maxent)"

inherit rpm
