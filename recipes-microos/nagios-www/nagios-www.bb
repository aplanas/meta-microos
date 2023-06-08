SUMMARY = "Provides the HTML and CGI files for the Nagios web interface"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
Several CGI programs are included with Nagios in order to allow you to \
view the current service status, problem history, notification history, \
and log file via the web. This package provides the HTML and CGI files \
for the Nagios web interface. In addition, HTML documentation is \
included in this package."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-www-4.4.7-2.4.aarch64.rpm"
RPM_HASH = "05e25f8f3a2ee47bcbae9fed98206b99abd92ff770c85fcd583309f3da6a46b4a1459a8d6f709fd24224c11bb73ee72303ed9d341be1e3aa0e5e492ef702c7da"

RPROVIDES:${PN} += "config(nagios-www) monitoring_webfrontend nagios-www nagios-www(aarch-64)"
RDEPENDS:${PN} += "/bin/logger /bin/sh /usr/bin/perl apache2 coreutils gawk gd grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgd.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) mod_php_any nagios php sed shadow"

inherit rpm
