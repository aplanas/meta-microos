SUMMARY = "Java class file shrinker, optimizer, obfuscator and preverifier"
DESCRIPTION = "ProGuard is a free Java class file shrinker, optimizer, obfuscator and \
preverifier. It detects and removes unused classes, fields, methods, and \
attributes. It optimizes bytecode and removes unused instructions. It \
renames the remaining classes, fields, and methods using short meaningless \
names. Finally, it preverifies the processed code for Java 6 or for Java \
Micro Edition."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-6.2.0-1.19.noarch.rpm"
RPM_HASH = "23e8ab306565e80de283d3ed5a1b33b711b4cf74a69617be641520616c84b5a98bf8ffa7d31766de49082dbc2e1cb47fa1b09c4c6b6209d3d85179c207636d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(net.sf.proguard:proguard-annotations) mvn(net.sf.proguard:proguard-annotations:pom:) mvn(net.sf.proguard:proguard-base) mvn(net.sf.proguard:proguard-base:pom:) mvn(net.sf.proguard:proguard-parent:pom:) mvn(net.sf.proguard:proguard-retrace) mvn(net.sf.proguard:proguard-retrace:pom:) proguard"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem javapackages-tools"

inherit rpm
