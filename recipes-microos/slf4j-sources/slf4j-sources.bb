SUMMARY = "SLF4J Source JARs"
DESCRIPTION = "SLF4J Source JARs."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-sources-1.7.36-3.3.noarch.rpm"
RPM_HASH = "f9136d85368ca70daffb7c22eeeaf9a1504adbc401eb0d8ee051d4e1ba55cb8da2712e8a0af1c344ffc6da010eec4f61bf36b4a686a58f61ac3b3c30aac525b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:jcl-over-slf4j::sources:) mvn(org.slf4j:jul-to-slf4j::sources:) mvn(org.slf4j:log4j-over-slf4j::sources:) mvn(org.slf4j:slf4j-api::sources:) mvn(org.slf4j:slf4j-ext::sources:) mvn(org.slf4j:slf4j-jcl::sources:) mvn(org.slf4j:slf4j-jdk14::sources:) mvn(org.slf4j:slf4j-log4j12::sources:) mvn(org.slf4j:slf4j-nop::sources:) mvn(org.slf4j:slf4j-reload4j::sources:) mvn(org.slf4j:slf4j-simple::sources:) slf4j-sources"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
