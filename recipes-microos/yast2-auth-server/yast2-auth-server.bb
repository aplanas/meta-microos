SUMMARY = "A tool for creating identity management server instances"
DESCRIPTION = "The program assists system administrators to create new directory server and \
Kerberos server instances that help to maintain centralised user identity \
database for a network."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-auth-server-4.6.1-1.1.noarch.rpm"
RPM_HASH = "2173da9c65189fa65213c44c619d3ec2db7d53e877541f9c2e14db19d1e003226d53779a7afed0e87abc6e7fa9ace0819c087c1c47ae32458c13c4a08bfb50bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.LDAPServer.desktop) metainfo() metainfo(org.opensuse.yast.LDAPServer.metainfo.xml) yast2-auth-server"
RDEPENDS:${PN} += "net-tools yast2 yast2-ruby-bindings"

inherit rpm
