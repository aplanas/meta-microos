SUMMARY = "An iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-5.2.8-4.2.noarch.rpm"
RPM_HASH = "f7637c2caafaddd7cf174a533ca4411a3c4d50c6fb5cef9a3ff3ea8bfcf1dbf206ac5a4b53a696fd051f54e881e81628e6d2c97cf16b29eb748b72e19e419222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(shorewall) perl(Shorewall::ARP) perl(Shorewall::Accounting) perl(Shorewall::Chains) perl(Shorewall::Compiler) perl(Shorewall::Config) perl(Shorewall::IPAddrs) perl(Shorewall::Misc) perl(Shorewall::Nat) perl(Shorewall::Proc) perl(Shorewall::Providers) perl(Shorewall::Proxyarp) perl(Shorewall::Raw) perl(Shorewall::Rules) perl(Shorewall::Tc) perl(Shorewall::Tunnels) perl(Shorewall::Zones) shoreline_firewall shorewall"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch /usr/sbin/service bc fillup iproute2 iptables logrotate perl(:MODULE_COMPAT_5.36.0) perl-base shorewall-core"

inherit rpm
