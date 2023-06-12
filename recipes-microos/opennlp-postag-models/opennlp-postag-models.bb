SUMMARY = "OpenNLP Postag Models"
DESCRIPTION = "Stock OpenNLP postag models. Maxent model with tag dictionary."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-postag-models-1.5-1.12.noarch.rpm"
RPM_HASH = "695d53d3686c6eb511d27a97be01edd4a3618b9ad85a11616ca07160012cb604da1a90554e20db5c09e2c86bf9456e7b37929e51657abdc6ce26b00a71fff062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(edu.washington.cs.knowitall:opennlp-postag-models) \
mvn(edu.washington.cs.knowitall:opennlp-postag-models:pom:) \
opennlp-postag-models"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
