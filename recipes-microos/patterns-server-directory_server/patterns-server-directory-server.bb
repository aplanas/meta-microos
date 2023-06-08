SUMMARY = "Directory Server (LDAP)"
DESCRIPTION = "Software to set up a directory server with OpenLDAP. The Lightweight Directory Access Protocol (LDAP) is used to access online directory services."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-directory_server-20210330-4.1.aarch64.rpm"
RPM_HASH = "8516c870af908eea2ee2ca559639f0b0eaf4f2e0c83e4cd28392e19d20476761f28886de44b7a4a7edab887d30135ec36695d98042eba0b4208ff705226e49dd"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-directory_server patterns-server-directory_server patterns-server-directory_server(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
