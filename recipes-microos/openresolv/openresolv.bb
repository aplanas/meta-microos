SUMMARY = "DNS management framework"
DESCRIPTION = "/etc/resolv.conf is a file that holds the configuration for the local resolution of domain names. \
Normally this file is either static or maintained by a local daemon, normally a DHCP daemon. \
openresolv will make sure, that multiple processes (eg. dhcpcd, NetworkManager, openvpn) \
can write the resolv.conf without overwriting each others changes. \
 \
openresolv can generate a combined resolv.conf or a configuration file for a local nameserver \
(like unbound, dnsmasq or bind) that will route the dns requests according to the search domain."
LICENSE = "BSD-2-Clause"

PV = "3.12.0"

RPM_NAME = "openresolv-3.12.0-1.8.noarch.rpm"
RPM_HASH = "d3fb1f02bad4655a7315bfd51df524a85a6fae3da9ba94a9ef4a5c53a6bc00bccd71db5586c8beda3d0344886380fe4089ee1a9a76d4df3610468f965619aade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(openresolv) \
openresolv"
RDEPENDS:${PN} += "/bin/sh \
bash"

inherit rpm
