SUMMARY = "Manages IPv4 and IPv6 addresses and subnets"
DESCRIPTION = "This module provides an object-oriented abstraction on top of IP addresses \
or IP subnets that allows for easy manipulations. Version 4.xx of \
NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt. \
 \
The internal representation of all IP objects is in 128 bit IPv6 notation. \
IPv4 and IPv6 objects may be freely mixed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.079"

RPM_NAME = "perl-NetAddr-IP-4.079-1.33.aarch64.rpm"
RPM_HASH = "90e0fc8c65a133252ef8c2d9c4bd8af608c578761f614942754cd74928cf3cdf2db8342a5a2381a4dda483b0d4da009cb8d6b2600a48e5699b1fa44c9a778c4b"

RPROVIDES:${PN} += "perl(NetAddr::IP) perl(NetAddr::IP::InetBase) perl(NetAddr::IP::Lite) perl(NetAddr::IP::Util) perl(NetAddr::IP::UtilPP) perl(NetAddr::IP::UtilPolluted) perl(NetAddr::IP::Util_IS) perl-NetAddr-IP perl-NetAddr-IP(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
