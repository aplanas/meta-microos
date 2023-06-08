SUMMARY = "ThrowingProviders extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides ThrowingProviders module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-throwingproviders-5.1.0-1.1.noarch.rpm"
RPM_HASH = "69fcb4693b90653ad3a6e446f9a05a25fa5a2d5e8821f8852de47d3c68eccf8c040b29391f727ca5468f257b049f04d9004e9663c062687ef11e5f6c1efc5642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-throwingproviders mvn(com.google.inject.extensions:guice-throwingproviders) mvn(com.google.inject.extensions:guice-throwingproviders:pom:) mvn(org.sonatype.sisu.inject:guice-throwingproviders) mvn(org.sonatype.sisu.inject:guice-throwingproviders:pom:) osgi(com.google.inject.throwingproviders)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.code.findbugs:jsr305) mvn(com.google.truth:truth)"

inherit rpm
