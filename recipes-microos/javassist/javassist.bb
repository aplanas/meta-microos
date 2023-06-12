SUMMARY = "Java Programming Assistant: bytecode manipulation"
DESCRIPTION = "Javassist (Java Programming Assistant) makes Java bytecode manipulation \
simple. It is a class library for editing bytecodes in Java; it enables \
Java programs to define a new class at runtime and to modify a class \
file when the JVM loads it. Unlike other similar bytecode editors, \
Javassist provides two levels of API: source level and bytecode level. \
If the users use the source-level API, they can edit a class file \
without knowledge of the specifications of the Java bytecode. The whole \
API is designed with only the vocabulary of the Java language. You can \
even specify inserted bytecode in the form of source text; Javassist \
compiles it on the fly. On the other hand, the bytecode-level API \
allows the users to directly edit a class file as other editors."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-3.29.2-1.2.noarch.rpm"
RPM_HASH = "4b2f6808b8319123494f095204fc147354e061c42bec01de952530ae5464652390b75cfb79b58cd58f9bb320e25602cb1a88ba02f8c35b0e1f75a88abd3ee6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist \
mvn(javassist:javassist) \
mvn(javassist:javassist:pom:) \
mvn(org.javassist:javassist) \
mvn(org.javassist:javassist:pom:) \
osgi(javassist)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
