SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Java bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-java-21.12-3.1.aarch64.rpm"
RPM_HASH = "17289c94ca7bf8911f88d62d1bb49952c12516e0db67ae42623b78296c748f2a87d7661672a66550fa25ca766483241ff20a37358111c82582c8f40b167aaf6c"

RPROVIDES:${PN} += "mvn(com.google.protobuf:protobuf-bom:pom:) mvn(com.google.protobuf:protobuf-java) mvn(com.google.protobuf:protobuf-java:pom:) mvn(com.google.protobuf:protobuf-parent:pom:) protobuf-java protobuf-java(aarch-64)"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem"

inherit rpm
