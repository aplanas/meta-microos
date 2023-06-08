SUMMARY = "Perl Xs Interface for a Portable Traditional"
DESCRIPTION = "This module implements the DES-based Unix _crypt_ function. For those who \
need to construct non-standard variants of _crypt_, the various building \
blocks used in _crypt_ are also supplied separately."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Crypt-UnixCrypt_XS-0.11-1.32.aarch64.rpm"
RPM_HASH = "edf0263b7fff1172e8de0adf4d56d50a69e2d5599378781d39795e66cef9686a64f0d221cffe5703dbc64f20d37dac617a5512d6da149eb94c384fc4ba5c47ac"

RPROVIDES:${PN} += "perl(Crypt::UnixCrypt_XS) perl-Crypt-UnixCrypt_XS perl-Crypt-UnixCrypt_XS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
