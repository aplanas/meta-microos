SUMMARY = "Parallel remote shell program"
DESCRIPTION = "Pdsh is a multithreaded remote shell client which executes commands on \
multiple remote hosts in parallel.  Pdsh can use several different \
remote shell services, including Kerberos IV and ssh."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-2.34-10.2.aarch64.rpm"
RPM_HASH = "9ee0c610c65c42c138a4f2bf7e1fbbf4029077b37a1a735135beac401d71e39ee9214bb76fa8f505ba2e1d448215844649608cd28bfcd223d4079acd78a79785"

RPROVIDES:${PN} += "pdsh \
pdsh(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmunge.so.2()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
