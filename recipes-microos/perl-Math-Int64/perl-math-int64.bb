SUMMARY = "Manipulate 64 bits integers in Perl"
DESCRIPTION = "This module adds support for 64 bit integers, signed and unsigned, to Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-Math-Int64-0.54-1.17.aarch64.rpm"
RPM_HASH = "ef2d7dce913f4fa31135008f2fc915e311395fa47138696f4b077234e3f05335bdd09d7078b5365953d3bda947745c9d34dad638055a4cc23914d05ad36774cc"

RPROVIDES:${PN} += "perl(Math::Int64) perl(Math::Int64::die_on_overflow) perl(Math::Int64::native_if_available) perl(Math::UInt64) perl-Math-Int64 perl-Math-Int64(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl-base"

inherit rpm
