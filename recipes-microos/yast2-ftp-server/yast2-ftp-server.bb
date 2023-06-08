SUMMARY = "YaST2 - FTP configuration"
DESCRIPTION = "This package contains the YaST2 component for FTP configuration. It can \
configure vsftpd."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ftp-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "233e7b5947c92c2ed7b65e2f3ef8e4c80b786b751a3c328d1c74c518abdbcbacc0ee885e4e9c35b87d34ad2fa696ee409a9f91306e05ba37f77fa7b2d51f119c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.FTPServer.desktop) metainfo() metainfo(org.opensuse.yast.FTPServer.metainfo.xml) yast2-ftp-server"
RDEPENDS:${PN} += "yast2 yast2-ruby-bindings yast2-users"

inherit rpm
