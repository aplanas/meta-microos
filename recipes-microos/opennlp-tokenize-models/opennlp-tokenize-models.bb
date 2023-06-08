SUMMARY = "OpenNLP Tokenizer Models"
DESCRIPTION = "Stock OpenNLP tokenizer models trained on opennlp training data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-tokenize-models-1.5-1.12.noarch.rpm"
RPM_HASH = "0d0539aaca33ba7b14428f0ec16b0b830114a56cf3c33b29442e0340cca250aa87b2071f8d9e1140e91820a94016e140b60dd30ddd61ba4c12e7486b60df684a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(edu.washington.cs.knowitall:opennlp-tokenize-models) mvn(edu.washington.cs.knowitall:opennlp-tokenize-models:pom:) opennlp-tokenize-models"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
