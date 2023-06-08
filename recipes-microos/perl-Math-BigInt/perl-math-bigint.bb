SUMMARY = "Arbitrary size integer math package"
DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.999838"

RPM_NAME = "perl-Math-BigInt-1.999838-1.1.noarch.rpm"
RPM_HASH = "73fc847f54b4147a52cadc6f31565f0edd44241ea37ab5cef5747931016eb2277c5f190b4b307741729e6c83faf7bc81e78855bc003a37aad07add8674b60cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Math::BigFloat) perl(Math::BigInt) perl(Math::BigInt::Calc) perl(Math::BigInt::Lib) perl-Math-BigInt"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Carp) perl(Math::Complex)"

inherit rpm
