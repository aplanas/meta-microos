SUMMARY = "YaST2 - Sysconfig Editor"
DESCRIPTION = "A graphical /etc/sysconfig/* editor with integrated search and context \
information."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-sysconfig-4.6.0-1.1.noarch.rpm"
RPM_HASH = "9c5a698bef763a5603da285e8e576a118eeacdf7bc1d593dc9b7fbc082c29d3708283e02482bc6c35725cb9fbbbda05b29f252e84cb3ea49af0d0c752ad18b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Sysconfig.desktop) metainfo() metainfo(org.opensuse.yast.Sysconfig.metainfo.xml) yast2-sysconfig"
RDEPENDS:${PN} += "/usr/bin/perl perl yast2 yast2-ruby-bindings"

inherit rpm
