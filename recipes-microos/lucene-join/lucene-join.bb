SUMMARY = "Join module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'join' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-join-8.5.0-3.4.noarch.rpm"
RPM_HASH = "7b70bdafc1aa2ee779466c63aefef28324d8798cbfbf62a11f7eeb7c1f9589ae09e49ff225b2785442f0727f98f6f0329e22bbb6a6ef83a940a654281ccd7972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-join mvn(org.apache.lucene:lucene-join) mvn(org.apache.lucene:lucene-join:pom:) osgi(org.apache.lucene.join)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.lucene:lucene-core)"

inherit rpm
