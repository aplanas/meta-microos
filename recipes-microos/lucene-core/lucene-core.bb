SUMMARY = "Text search engine"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
It offers fuzzy search based on edit (Levenshtein) distance, \
incremental indexing, ranked searching, field-based searches and \
multi-index searches."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-core-8.5.0-3.4.noarch.rpm"
RPM_HASH = "c553331b0351169d2da91ce3b7dfc8b7c5fcee2bc49e1173b5a8cac2571d1faa54d298e11109d80e156a560b5428485604b351b751c5a94e54ab529805ad284e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene lucene-core mvn(org.apache.lucene:lucene-core) mvn(org.apache.lucene:lucene-core:pom:) osgi(org.apache.lucene.core)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
