SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that makes it easy to repackage Java \
libraries and embed them into your own distribution. This is useful for \
two reasons: You can easily ship a single jar file with no external \
dependencies. You can avoid problems where your library depends on a \
specific version of a library, which may conflict with the dependencies \
of another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-1.4-4.11.noarch.rpm"
RPM_HASH = "3eb549f1b142d033060f2c37feae1e614300ff26f96d82930e56dbc7c63437a0db2479e79b889d69c7a7c16fca6fa4d86a081af38765acc9f9ea39851657a657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jarjar \
mvn(com.googlecode.jarjar:jarjar) \
mvn(com.googlecode.jarjar:jarjar:pom:) \
mvn(com.tonicsystems:jarjar) \
mvn(com.tonicsystems:jarjar-util) \
mvn(com.tonicsystems:jarjar-util:pom:) \
mvn(com.tonicsystems:jarjar:pom:) \
mvn(jarjar:jarjar) \
mvn(jarjar:jarjar-util) \
mvn(jarjar:jarjar-util:pom:) \
mvn(jarjar:jarjar:pom:) \
mvn(org.gradle.jarjar:jarjar) \
mvn(org.gradle.jarjar:jarjar:pom:) \
mvn(tonic:jarjar) \
mvn(tonic:jarjar-util) \
mvn(tonic:jarjar-util:pom:) \
mvn(tonic:jarjar:pom:)"
RDEPENDS:${PN} += "gnu-regexp \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(org.ow2.asm:asm) \
mvn(org.ow2.asm:asm-util) \
objectweb-anttask \
objectweb-asm"

inherit rpm
