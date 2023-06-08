SUMMARY = "A YaST module for configuring VPN gateway and clients"
DESCRIPTION = "A YaST module for managing VPN gateway and client connections to secure site-to-site communication via IPSec VPN."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-vpn-4.6.0-1.1.noarch.rpm"
RPM_HASH = "3cc67b1d4a73070fd58fa9377a911bdcf4c5140c9efde01e301977dc54569634c24d9db7ae3ad49c27f59a5699c23c6d3867202695331cada2be8adb8e1ae048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.VPN.desktop) metainfo() metainfo(org.opensuse.yast.VPN.metainfo.xml) yast2-vpn"
RDEPENDS:${PN} += "/usr/bin/mkdir /usr/bin/touch fillup yast2 yast2-ruby-bindings"

inherit rpm
