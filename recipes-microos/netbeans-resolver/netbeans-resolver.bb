SUMMARY = "Resolver subproject of xml-commons patched for NetBeans"
DESCRIPTION = "Resolver subproject of xml-commons, version 1.2 with \
a patch for NetBeans."
LICENSE = "Apache-1.1"

PV = "6.7.1"

RPM_NAME = "netbeans-resolver-6.7.1-19.19.noarch.rpm"
RPM_HASH = "24247ede5cb50dd248dac5f3e776f8b4cc58be1db7c7423780fea13d22e24d21eefed578c8a91487d0c285bb8715f3c5bdaddeec0f9195512e6b657ab00f3279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-resolver"
RDEPENDS:${PN} += "java javapackages-tools"

inherit rpm
