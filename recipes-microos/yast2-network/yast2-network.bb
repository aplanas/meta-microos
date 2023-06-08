SUMMARY = "YaST2 - Network Configuration"
DESCRIPTION = "This package contains the YaST2 component for network configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-network-4.6.2-1.1.noarch.rpm"
RPM_HASH = "84b1b5ceb9ea802a17177b14dc9fac4a4912a146a8963e9975d5d08faf9008493e3b1f6034662cebe874134d900ce01a55e8c55d8545f92e4b08bdd1429b5493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Host.desktop) application(org.opensuse.yast.LAN.desktop) application(org.opensuse.yast.Remote.desktop) metainfo() metainfo(org.opensuse.yast.Host.metainfo.xml) metainfo(org.opensuse.yast.LAN.metainfo.xml) metainfo(org.opensuse.yast.Remote.metainfo.xml) yast2-network yast2-network-devel-doc"
RDEPENDS:${PN} += "/bin/rm /usr/bin/perl augeas-lenses hostname hwinfo rubygem(ruby:3.2.0:cfa) sysconfig yast2 yast2-packager yast2-proxy yast2-ruby-bindings yast2-storage-ng yast2-xml"

inherit rpm
