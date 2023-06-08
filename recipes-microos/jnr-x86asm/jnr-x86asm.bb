SUMMARY = "Pure java x86 and x86_64 assembler"
DESCRIPTION = "This is a pure-java port of asmjit (http://code.google.com/p/asmjit/)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-1.0.2-2.13.noarch.rpm"
RPM_HASH = "a6dc8d0f284e13a74d8703b82c5f3e2de230ab2b76bf185ae7181b2419e2a0acdbae0398a97ae0309830556578525832b0b1ccc955523c767a3fa66997542302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm mvn(com.github.jnr:jnr-x86asm) mvn(com.github.jnr:jnr-x86asm:pom:) osgi(jnr.x86asm)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
