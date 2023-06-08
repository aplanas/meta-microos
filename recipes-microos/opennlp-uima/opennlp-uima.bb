SUMMARY = "Apache OpenNLP UIMA Annotators"
DESCRIPTION = "This package provides Apache OpenNLP UIMA Annotators."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-uima-1.5.3-3.10.noarch.rpm"
RPM_HASH = "eb20c0073da90caf610cd18b8dee1201f78299b6a8db017e270c613793645c6e75cb0a949a0c3088589baf0af7523d3ddd87fbbb01ef92cfcd9d25ed0b0ffd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.opennlp:opennlp-uima) mvn(org.apache.opennlp:opennlp-uima:pom:) opennlp-uima"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.opennlp:opennlp-tools)"

inherit rpm
