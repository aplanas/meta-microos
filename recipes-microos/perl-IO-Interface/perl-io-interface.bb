SUMMARY = "Perl extension for access to network card configuration information"
DESCRIPTION = "IO::Interface adds methods to IO::Socket objects that allows them to be \
used to retrieve and change information about the network interfaces on \
your system. In addition to the object-oriented access methods, you can use \
a function-oriented style. \
 \
THIS API IS DEPRECATED. Please see IO::Interface::Simple for the preferred \
way to get and set interface configuration information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-IO-Interface-1.09-2.35.aarch64.rpm"
RPM_HASH = "0ffae67d0dd4f6e0852dbcad11f68589ccafcfe3a2deb21bb6ef5ab38cb5e5272b1bc2faa526797b0d7ef7aa1190c65c96e9d7027fc422e197777079a088499d"

RPROVIDES:${PN} += "perl(IO::Interface) perl(IO::Interface::Simple) perl-IO-Interface perl-IO-Interface(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
