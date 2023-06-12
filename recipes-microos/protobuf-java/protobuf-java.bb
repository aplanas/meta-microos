SUMMARY = "Java Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Java bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-java-21.12-3.2.aarch64.rpm"
RPM_HASH = "60dca9424d9b3dd846924fa68a9834bbe2b315260629521ad6524413d9ee1b216fe0b3a1119e14c33f7d594025714162c6a1df01be3d8f0730c9e02294d206b3"

RPROVIDES:${PN} += "mvn(com.google.protobuf:protobuf-bom:pom:) mvn(com.google.protobuf:protobuf-java) mvn(com.google.protobuf:protobuf-java:pom:) mvn(com.google.protobuf:protobuf-parent:pom:) protobuf-java protobuf-java(aarch-64)"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem"

inherit rpm
