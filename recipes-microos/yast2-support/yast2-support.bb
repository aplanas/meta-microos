SUMMARY = "YaST2 - Support Inquiries"
DESCRIPTION = "This module allows you to collect system information for installation \
support in a standardized format."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-support-4.6.0-1.1.noarch.rpm"
RPM_HASH = "7ebc67c82b678067c627dc009dd4d315504509c6fd5352742335bb769010adeaad45e8c91fd0f71c9299cfd031c6de5045b0ac3d1735a0589bb4cbcfcf0eac94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Support.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Support.metainfo.xml) \
yast2-support"
RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
