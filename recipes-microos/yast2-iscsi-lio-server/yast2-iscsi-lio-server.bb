SUMMARY = "Configuration of iSCSI LIO target"
DESCRIPTION = "This package contains configuration of iSCSI LIO target"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-iscsi-lio-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "923707676dde4a1a44d5ceea178637c8a5a1b19b4eff55d856190b4437b2c0ff2d5712a8168e0d9fac9691bd8a07d4c7f4c6faa933a600e7580e55a897522467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.iSCILIOServer.desktop) metainfo() metainfo(org.opensuse.yast.iSCILIOServer.metainfo.xml) yast2-iscsi-lio-server"
RDEPENDS:${PN} += "python3-configshell-fb python3-rtslib-fb python3-targetcli-fb yast2 yast2-ruby-bindings"

inherit rpm
