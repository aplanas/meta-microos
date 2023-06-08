SUMMARY = "Google Core Libraries for Java"
DESCRIPTION = "Guava is a suite of core and expanded libraries that include \
utility classes, Google's collections, io classes, and much \
much more. \
This project is a complete packaging of all the Guava libraries \
into a single jar.  Individual portions of Guava can be used \
by downloading the appropriate module and its dependencies."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "31.1"

RPM_NAME = "guava-31.1-2.4.noarch.rpm"
RPM_HASH = "11a1eb0784239ef58a228a06c64245e093b57db56f249e0d4ee108572d6b8ada7c461dcfff92ba9bdf85ca0442ad78039516b5f36d8e40c5c111b2cbb0e2e293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava mvn(com.google.guava:failureaccess) mvn(com.google.guava:failureaccess:pom:) mvn(com.google.guava:guava) mvn(com.google.guava:guava:pom:) osgi(com.google.guava)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.code.findbugs:jsr305)"

inherit rpm
