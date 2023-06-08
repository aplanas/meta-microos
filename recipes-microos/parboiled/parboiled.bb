SUMMARY = "Java/Scala library providing parsing of input text based on PEGs"
DESCRIPTION = " \
 \
 \
 \
parboiled is a mixed Java/Scala library providing parsing of \
arbitrary input text based on Parsing expression grammars (PEGs). \
PEGs are an alternative to context free grammars (CFGs) for formally \
specifying syntax, they make a replacement for regular expressions \
and generally have some advantages over the 'traditional' way of \
building parser via CFGs."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-1.1.6-5.6.noarch.rpm"
RPM_HASH = "70ad4db6183c4207dc31f3289a7ae8d8eca1547e2d6c90b8804e88d3c4658b9362a2d940c2dc1379d580e1f5060345a5d9ff7757c0b92db2628d228dd8f89976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.parboiled:parboiled-core) mvn(org.parboiled:parboiled-core:pom:) mvn(org.parboiled:parboiled-java) mvn(org.parboiled:parboiled-java:pom:) osgi(org.parboiled.core) osgi(org.parboiled.java) parboiled"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.ow2.asm:asm) mvn(org.ow2.asm:asm-analysis) mvn(org.ow2.asm:asm-tree) mvn(org.ow2.asm:asm-util)"

inherit rpm
