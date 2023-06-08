SUMMARY = "Very Fast Base to Base Conversion"
DESCRIPTION = "This module provides fast functions and methods to convert between \
arbitrary number bases from 2 (binary) thru 65535. \
 \
This module is pure Perl, has no external dependencies, and is backward \
compatible with old versions of Perl 5."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Math-Base-Convert-0.11-2.23.noarch.rpm"
RPM_HASH = "9b6094c881563ec6a4b9915c127159ad9e0ed677da0f61491f2d6b48e74dbabed18ca2e71141ab6555eeab116e8c32ec88c22be20ff1cc5102bef7037364fbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Math::Base::Convert) perl(Math::Base::Convert::Bases) perl(Math::Base::Convert::Bitmaps) perl(Math::Base::Convert::CalcPP) perl(Math::Base::Convert::Shortcuts) perl-Math-Base-Convert"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
