SUMMARY = "Memory module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'memory' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-memory-8.5.0-3.4.noarch.rpm"
RPM_HASH = "9432ec49d75defbc53a0e31dda476a9a582129c21dce2f717c3dca7adf8159c6ac87ea87256cdbf0657a9a364692aac3f5f1764e569b5a66e8f02e65682c0819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-memory mvn(org.apache.lucene:lucene-memory) mvn(org.apache.lucene:lucene-memory:pom:) osgi(org.apache.lucene.memory)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.lucene:lucene-core)"

inherit rpm
