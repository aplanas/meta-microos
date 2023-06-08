SUMMARY = "Queryparser module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queryparser' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queryparser-8.5.0-3.4.noarch.rpm"
RPM_HASH = "08b25af0b56a5a2e5dd9285417f5aec8ca8328aae703ef7acd72037e7d880b48ea0aea5b3bd4309ce5ffe5d4a600c0eb8e910b7108e1a586b032bed1c47788ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queryparser mvn(org.apache.lucene:lucene-queryparser) mvn(org.apache.lucene:lucene-queryparser:pom:) osgi(org.apache.lucene.queryparser)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.lucene:lucene-core) mvn(org.apache.lucene:lucene-queries) mvn(org.apache.lucene:lucene-sandbox)"

inherit rpm
