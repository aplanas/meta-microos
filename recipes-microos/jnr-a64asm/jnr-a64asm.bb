SUMMARY = "AArch64 assembler for the Java Native Runtime"
DESCRIPTION = "This is a pure-java port of asmjit for AARCH64 architecture \
(http://code.google.com/p/asmjit/). This is remote assembler for jnr-ffi to \
support aarch64 architecture."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-1.0.0-2.1.noarch.rpm"
RPM_HASH = "9716c920d406161167031ea8ec039807a0366fd155ca7220dd7e87b08a8403471238fb75b6bd521254ac6fa66017656c19474f0ebdcd1cce7f14ada021c4b9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm mvn(com.github.jnr:jnr-a64asm) mvn(com.github.jnr:jnr-a64asm:pom:) osgi(com.github.jnr.a64asm)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
