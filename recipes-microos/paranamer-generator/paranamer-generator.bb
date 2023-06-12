SUMMARY = "ParaNamer Generator"
DESCRIPTION = "This package contains the ParaNamer Generator."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-generator-2.8-2.10.noarch.rpm"
RPM_HASH = "28afa55461ee54b87f5077d83ad82fff69b8dd90d68f02e94f395e90d7e3e9575885192802d56b17eb581ba7d310e792e9b64ef5827dd1a814eb7a09f122420c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.paranamer:paranamer-generator) \
mvn(com.thoughtworks.paranamer:paranamer-generator:pom:) \
paranamer-generator"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.qdox:qdox) \
mvn(org.ow2.asm:asm)"

inherit rpm
