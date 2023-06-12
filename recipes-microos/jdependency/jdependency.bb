SUMMARY = "An API to analyse class dependencies"
DESCRIPTION = "jdependency is library that helps analyzing class level \
dependencies, clashes and missing classes."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "jdependency-1.2-4.6.noarch.rpm"
RPM_HASH = "84819bfb43637ff39c25dbeb48abe4516c8565682db0a6c268902053e9585a21999844e283b7cc40a0f15da9c9cb531f3f63d1088382271eb34c2c2ddca207ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency \
mvn(org.vafer:jdependency) \
mvn(org.vafer:jdependency:pom:)"
RDEPENDS:${PN} += "apache-commons-io \
java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.ow2.asm:asm) \
mvn(org.ow2.asm:asm-analysis) \
mvn(org.ow2.asm:asm-commons) \
mvn(org.ow2.asm:asm-tree) \
mvn(org.ow2.asm:asm-util) \
objectweb-asm"

inherit rpm
