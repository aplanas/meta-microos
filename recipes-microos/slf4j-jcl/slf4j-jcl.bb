SUMMARY = "SLF4J JCL Binding"
DESCRIPTION = "SLF4J JCL Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jcl-1.7.36-3.3.noarch.rpm"
RPM_HASH = "f0257151a2c9e49b7b3b69c3fc1de228fec563ca442d1774624ce0f81fd99314f01bcdb05f7ea8b57d9d580ff36229eaa3350788938157c906d3a4f1b6e6a8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-jcl) mvn(org.slf4j:slf4j-jcl:pom:) osgi(slf4j.jcl) slf4j-jcl"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-logging:commons-logging) mvn(org.slf4j:slf4j-api) osgi(slf4j.api)"

inherit rpm
