SUMMARY = "Common Scalar and List utility subroutines"
DESCRIPTION = "Common Scalar and List utility subroutines"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.63"

RPM_NAME = "perl-Scalar-List-Utils-1.63-1.3.aarch64.rpm"
RPM_HASH = "750535f5e4eb9a6298151ce81a6430b255abfaf154be886bcb206a772731579f2ea6c429c89a1356fc830c9308babbd9c6df642cc8ba06910c6a76df22db0353"

RPROVIDES:${PN} += "perl(List::Util) perl(List::Util::XS) perl(Scalar::Util) perl(Sub::Util) perl-Scalar-List-Utils perl-Scalar-List-Utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
