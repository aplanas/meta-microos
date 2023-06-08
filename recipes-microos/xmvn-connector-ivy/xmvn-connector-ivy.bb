SUMMARY = "XMvn Connector for Apache Ivy"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.0.0~20220623.8da91ea"

RPM_NAME = "xmvn-connector-ivy-4.0.0~20220623.8da91ea-1.1.noarch.rpm"
RPM_HASH = "edf50c62725ab38e421bafc1a83da08c16292408f37d1628fbb47c88603e6c6cda7da8180aaab5c04450db63f157e0a85912bd3381807bcfd22beb6c4ddcd7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-connector-ivy) mvn(org.fedoraproject.xmvn:xmvn-connector-ivy:pom:) xmvn-connector-ivy"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.fedoraproject.xmvn:xmvn-api) mvn(org.slf4j:slf4j-api)"

inherit rpm
