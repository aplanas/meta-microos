SUMMARY = "The guava-testlib artifact"
DESCRIPTION = "guava-testlib provides additional functionality for conveninent unit testing"
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "31.1"

RPM_NAME = "guava-testlib-31.1-2.4.noarch.rpm"
RPM_HASH = "6bb0113277e748a0b1245a6f931a5ad36e39da80df715054ed53e2c3c32de2ebeac3682b8470ab480384bd7232a5195e466a3efc3208eb48da9c2155cac09cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-testlib mvn(com.google.guava:guava-testlib) mvn(com.google.guava:guava-testlib:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.code.findbugs:jsr305) mvn(com.google.guava:guava) mvn(junit:junit)"

inherit rpm
