SUMMARY = "XS implementation of parts of Class::Load"
DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. See \
Class::Load for API details."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Class-Load-XS-0.10-1.31.aarch64.rpm"
RPM_HASH = "eafc1ae6bb3443d7c36c8eb4de7c0bc189b1d8f141c11696802a66db5389ed5e726cb567dee7bd607d1cc0a30014c53590e624e48bc408dce6b3cf4ab893fdd5"

RPROVIDES:${PN} += "perl(Class::Load::XS) perl-Class-Load-XS perl-Class-Load-XS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Class::Load)"

inherit rpm
