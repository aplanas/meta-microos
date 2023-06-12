SUMMARY = "YaST2 - NFS Configuration"
DESCRIPTION = "The YaST2 component for configuration of NFS. NFS stands for network \
file system access. It allows access to files on remote machines."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-nfs-client-4.6.1-1.1.noarch.rpm"
RPM_HASH = "bee8861427bf50bd55d06889e7899b6dfc24fc95b85f68b5a923165b1634589202c34694a954e0b2f5bfc12e2d1bacb76bd55d188c4d6556b2aef076735f54b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.NFS.desktop) \
metainfo() \
metainfo(org.opensuse.yast.NFS.metainfo.xml) \
yast2-config-network:/usr/lib/YaST2/clients/lan_nfs_client.ycp \
yast2-config-nfs \
yast2-config-nfs-devel \
yast2-nfs-client \
yast2-trans-nfs"
RDEPENDS:${PN} += "/usr/bin/killall \
yast2 \
yast2-nfs-common \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
