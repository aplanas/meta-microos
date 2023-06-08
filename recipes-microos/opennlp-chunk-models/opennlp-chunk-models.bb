SUMMARY = "OpenNLP Chunker Models"
DESCRIPTION = "Stock OpenNLP chunker models trained on conll2000 shared task data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-chunk-models-1.5-1.12.noarch.rpm"
RPM_HASH = "27b6cf1914804b2c0a1298ead1773b2d3ad58294d8fa42c2876a2ab3db3ce1460a5fbcdf06bc0e52efb47e8e472e89bfb7e098a590fc8ec4326dce9b3f077965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(edu.washington.cs.knowitall:opennlp-chunk-models) mvn(edu.washington.cs.knowitall:opennlp-chunk-models:pom:) opennlp-chunk-models"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
