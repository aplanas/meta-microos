SUMMARY = "Java bytecode manipulation framework"
DESCRIPTION = "ASM is a Java bytecode manipulation framework. \
 \
It can be used to dynamically generate stub classes or other proxy \
classes, directly in binary form, or to dynamically modify classes at \
load time, i.e., just before they are loaded into the Java Virtual \
Machine. \
 \
ASM offers similar functionalities as BCEL or SERP, but is much \
smaller."
LICENSE = "BSD-3-Clause"

PV = "9.5"

RPM_NAME = "objectweb-asm-9.5-1.1.noarch.rpm"
RPM_HASH = "0179b6390d0feb837ade88626cc32ac94d37e047458fb0c15af4b23ec0f03beb73f829d6c7070095d21344e38b8a177f087eb8681db3ce82c665b14022a856de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.ow2.asm:asm) mvn(org.ow2.asm:asm-all) mvn(org.ow2.asm:asm-all:pom:) mvn(org.ow2.asm:asm-analysis) mvn(org.ow2.asm:asm-analysis:pom:) mvn(org.ow2.asm:asm-commons) mvn(org.ow2.asm:asm-commons:pom:) mvn(org.ow2.asm:asm-debug-all) mvn(org.ow2.asm:asm-debug-all:pom:) mvn(org.ow2.asm:asm-tree) mvn(org.ow2.asm:asm-tree:pom:) mvn(org.ow2.asm:asm-util) mvn(org.ow2.asm:asm-util:pom:) mvn(org.ow2.asm:asm:pom:) objectweb-asm osgi(org.objectweb.asm) osgi(org.objectweb.asm.analysis) osgi(org.objectweb.asm.commons) osgi(org.objectweb.asm.tree) osgi(org.objectweb.asm.util)"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem"

inherit rpm
