SUMMARY = "Apache components to build asynchronous client side HTTP services"
DESCRIPTION = "Asynch HttpClient is a HTTP/1.1 compliant HTTP agent implementation based on \
HttpCore NIO and HttpClient components. It is a complementary module to \
Apache HttpClient intended for special cases where ability to handle \
a great number of concurrent connections is more important than performance \
in terms of a raw data throughput."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-4.1.4-3.9.noarch.rpm"
RPM_HASH = "5ad543536aa29d10f4837b912fd35230ae0bd643db0d575edc7324f40fa7ad4bd0a1914adc5930a1b40e602d1c693c9ba961cace8b90549f92afc0d2dfae3fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient mvn(org.apache.httpcomponents:httpasyncclient) mvn(org.apache.httpcomponents:httpasyncclient:pom:) osgi(org.apache.httpcomponents.httpasyncclient)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-logging:commons-logging) mvn(org.apache.httpcomponents:httpclient) mvn(org.apache.httpcomponents:httpcore) mvn(org.apache.httpcomponents:httpcore-nio)"

inherit rpm
