SUMMARY = "Check fail2ban server and how many IPs are currently banned"
DESCRIPTION = "This plugin checks if the fail2ban server is running and how many IPs are \
currently banned.  You can use this plugin to monitor all the jails or just a \
specific jail. \
 \
How to use \
---------- \
Just have to run the following command: \
  $ ./check_fail2ban --help"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "monitoring-plugins-fail2ban-1.0.2-1.2.noarch.rpm"
RPM_HASH = "a7a331c65826f46209bf31ece40af82d5bd0cfb87fbb86796d017a2aef734dd33321d6ed073b21bb3a59f9c35a37f886a9d71b0e77fe67256a090b5982e9d801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-fail2ban nagios-plugins-fail2ban"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
