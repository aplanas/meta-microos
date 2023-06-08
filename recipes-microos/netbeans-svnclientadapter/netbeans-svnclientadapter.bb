SUMMARY = "Subversion Client Adapter"
DESCRIPTION = "SVNClientAdapter is a high-level Java API for Subversion."
LICENSE = "Apache-2.0"

PV = "6.7.1"

RPM_NAME = "netbeans-svnclientadapter-6.7.1-22.6.noarch.rpm"
RPM_HASH = "75616ce70d4313b2c49eaabea3717d14924549712c820e3a8276fe43a794ff691e94f14e09d7bba62de2c2e82ee59babfbe377371466b00130f6690c16840fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-svnclientadapter"
RDEPENDS:${PN} += "java javapackages-tools subversion"

inherit rpm
