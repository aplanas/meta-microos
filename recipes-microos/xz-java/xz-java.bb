SUMMARY = "Pure Java implementation of XZ compression"
DESCRIPTION = "This is an implementation of XZ data compression in pure Java. \
Single-threaded streamed compression and decompression and random access \
decompression have been implemented."
LICENSE = "SUSE-Public-Domain"

PV = "1.9"

RPM_NAME = "xz-java-1.9-1.2.noarch.rpm"
RPM_HASH = "9043ddeb78ff98cf5e441e712343c9c4c4b7291d25a752a688d48f4980b47e94b6faba7b6faef08e6755075d5a8bd512850fccf23885d1629362f0c766b99c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-xz mvn(org.tukaani:xz) mvn(org.tukaani:xz:pom:) osgi(org.tukaani.xz) xz-java"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
