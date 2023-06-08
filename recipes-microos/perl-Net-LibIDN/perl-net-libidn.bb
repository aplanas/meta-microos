SUMMARY = "Net::LibIDN Perl module"
DESCRIPTION = "This module provides Perl bindings for GNU Libidn by Simon Josefsson \
(http://www.gnu.org/software/libidn/) in way that was heavily inspired by \
PHP bindings for the same library done by Turbo Fredriksson (http://php- \
idn.bayour.com/). \
 \
Authors: \
-------- \
    Thomas Jacob, http://internet24.de"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Net-LibIDN-0.12-16.38.aarch64.rpm"
RPM_HASH = "305221fc27da7a37ffa524c0ee0ff49a7ea643a2543b2717076bebbe37e9ba0a5e5140db649c2c153062c332fb098b526a6a99f27b9dc4ab892d9d4741f462e1"

RPROVIDES:${PN} += "perl(Net::LibIDN) perl-Net-LibIDN perl-Net-LibIDN(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
