SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-embed-9.0.43-16.1.noarch.rpm"
RPM_HASH = "56b6c8e402bcefb3d5c18b75e02a2019ce69a267bb354818aab0eecaaabe1a780433641d54b473e4a5326114402ece883f285430db55b0bda5c466fdac776dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.tomcat.embed:tomcat-embed-core) mvn(org.apache.tomcat.embed:tomcat-embed-core:pom:) mvn(org.apache.tomcat.embed:tomcat-embed-el) mvn(org.apache.tomcat.embed:tomcat-embed-el:pom:) mvn(org.apache.tomcat.embed:tomcat-embed-jasper) mvn(org.apache.tomcat.embed:tomcat-embed-jasper:pom:) mvn(org.apache.tomcat.embed:tomcat-embed-websocket) mvn(org.apache.tomcat.embed:tomcat-embed-websocket:pom:) osgi(org.apache.tomcat-embed-core) osgi(org.apache.tomcat-embed-jasper) osgi(org.apache.tomcat-embed-jasper-el) osgi(org.apache.tomcat-embed-websocket) tomcat-embed"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.tomcat:tomcat-annotations-api) mvn(org.eclipse.jdt:ecj)"

inherit rpm
