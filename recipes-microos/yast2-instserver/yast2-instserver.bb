SUMMARY = "YaST2 - Installation Server Configuration and Management"
DESCRIPTION = "This package allows you to configure an installation server suitable \
for installaing SUSE Linux over the network. Currently FTP, HTTP and \
NFS sources are supported."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-instserver-4.6.0-1.1.noarch.rpm"
RPM_HASH = "8c934a98fb5d89a19f1cf2d48c1453b97f87572f36c0bb9433ba92db84fdaf149de45bac4a83510907f9c4860389adc7e59515243a70c65997a7abaec92d1ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.InstServer.desktop) \
metainfo() \
metainfo(org.opensuse.yast.InstServer.metainfo.xml) \
yast2-instserver"
RDEPENDS:${PN} += "/usr/bin/perl \
yast2 \
yast2-ruby-bindings"

inherit rpm
