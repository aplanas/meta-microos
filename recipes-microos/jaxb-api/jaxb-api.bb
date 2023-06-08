SUMMARY = "Jakarta XML Binding API"
DESCRIPTION = "The Jakarta XML Binding provides an API and tools that automate the mapping \
between XML documents and Java objects."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "jaxb-api-4.0.0-2.5.noarch.rpm"
RPM_HASH = "72aea6b2dede184faa0827d05c547f4b469a53be4cec92797fcceacaea0d4ea3a5462e038d77aff8cb64717bdcf29c6e6056d4f70a3f5a573d3792c047422452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxb-api mvn(jakarta.xml.bind:jakarta.xml.bind-api) mvn(jakarta.xml.bind:jakarta.xml.bind-api:pom:) osgi(jakarta.xml.bind-api)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(jakarta.activation:jakarta.activation-api)"

inherit rpm
