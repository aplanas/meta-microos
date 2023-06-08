SUMMARY = "AArch64 assembler for the Java Native Runtime"
DESCRIPTION = "This is a pure-java port of asmjit for AARCH64 architecture \
(http://code.google.com/p/asmjit/). This is remote assembler for jnr-ffi to \
support aarch64 architecture."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-1.0.0-1.13.noarch.rpm"
RPM_HASH = "e426bcae943aad6357ff2fdc9f5543fc9060a00530eae29228d58b840079ceb105f78bb1901ae80c14196040904d363721cbeef793575792b665f243d84cfb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm mvn(com.github.jnr:jnr-a64asm) mvn(com.github.jnr:jnr-a64asm:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
