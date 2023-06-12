SUMMARY = "Shoreline Firewall Lite is an iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Lite is a companion product to Shorewall that allows network \
administrators to centralize the configuration of Shorewall-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-lite-5.2.8-4.2.noarch.rpm"
RPM_HASH = "dd7a71f98195c666db71f9953a407bd7b26831035fffa77c0ab904d21ae3aa0c63b96594b9d419d80dc467c162845898fc6e9a648751b0cdc9e4379954eef18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(shorewall-lite) \
shoreline_firewall \
shorewall-lite"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
shorewall-core \
systemd"

inherit rpm
