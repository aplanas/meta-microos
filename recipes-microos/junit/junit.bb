SUMMARY = "Java regression test package"
DESCRIPTION = "JUnit is a regression testing framework written by Erich Gamma and Kent Beck. \
It is used by the developer who implements unit tests in Java."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-4.13.2-4.1.noarch.rpm"
RPM_HASH = "e570604e3c8e3abd6e03cd5c2d916209786bc9a14742341af3796198d20086e9bffbbf57f3fb47b0ca46c949ee1abb1a541d4b0d8217346a9bab95eb71a22428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit junit-demo junit4 junit4-demo mvn(junit:junit) mvn(junit:junit:pom:) osgi(org.junit)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.hamcrest:hamcrest-core)"

inherit rpm
