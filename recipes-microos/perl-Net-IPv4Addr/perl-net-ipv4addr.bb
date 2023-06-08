SUMMARY = "Net::IPv4Addr Module for Perl"
DESCRIPTION = "Net::IPv4Addr provides functions for parsing IPv4 addresses both in \
traditional address/netmask format and in the new CIDR format. There \
are also methods for calculating the network and broadcast address and \
also to see check if a given address is in a specific network. \
 \
Authors: \
-------- \
    Francis J. Lacoste <francis.lacoste@iNsu.COM>"
LICENSE = "GPL-2.0+"

PV = "0.10"

RPM_NAME = "perl-Net-IPv4Addr-0.10-166.24.aarch64.rpm"
RPM_HASH = "2d6653328341da9a2d4829ad3df169e90491a0d03420f9784551a1caee6a35bff07b9dffe305d6588078f6e42e3663bd7c84cbb806bfdf84103a87da31ca032a"

RPROVIDES:${PN} += "Net perl(Net::IPv4Addr) perl-Net-IPv4Addr perl-Net-IPv4Addr(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
