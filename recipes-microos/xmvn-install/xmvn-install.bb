SUMMARY = "XMvn Install"
DESCRIPTION = "This package provides XMvn Install, which is a command-line interface \
to XMvn installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-install-4.2.0-2.1.noarch.rpm"
RPM_HASH = "4b5698dfdad2dd68bc6011ae52640241588bebaa6032b04e6951edef37ef317c45efb95823cafa347c247a2db6484d546c12294f5402bfa57fbede9b5057452d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-install) \
mvn(org.fedoraproject.xmvn:xmvn-install:pom:) \
xmvn-install"
RDEPENDS:${PN} += "/bin/bash \
apache-commons-compress \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(com.beust:jcommander) \
mvn(org.apache.commons:commons-compress) \
mvn(org.fedoraproject.xmvn:xmvn-api) \
mvn(org.fedoraproject.xmvn:xmvn-core) \
mvn(org.ow2.asm:asm) \
mvn(org.slf4j:slf4j-api) \
mvn(org.slf4j:slf4j-simple) \
objectweb-asm \
slf4j \
xmvn-api \
xmvn-core"

inherit rpm
