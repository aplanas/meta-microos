SUMMARY = "Java Posix layer"
DESCRIPTION = "jnr-posix is a lightweight cross-platform POSIX emulation layer for Java, \
written in Java and is part of the JNR project (http://github.com/jnr)."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-3.1.16-1.1.noarch.rpm"
RPM_HASH = "ab95dc5a861578ab6b04375168a28b35b0cc625c93176dd6660ec751608b99019ceddffeafec4bedc6f90c3a5775f4df4f42d8edc485b2f1f1c688aa321aeca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix mvn(com.github.jnr:jnr-posix) mvn(com.github.jnr:jnr-posix:pom:) osgi(com.github.jnr.posix)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.github.jnr:jnr-constants) mvn(com.github.jnr:jnr-ffi)"

inherit rpm
