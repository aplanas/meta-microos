SUMMARY = "List modules and versions loaded if tests fail"
DESCRIPTION = "Assuming you shipped your module to CPAN with working tests, test failures \
from at http://www.cpantesters.org/ might be due to platform issues, Perl \
version issues or problems with dependencies. This module helps you \
diagnose deep dependency problems by showing you exactly what modules and \
versions were loaded during a test run."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-DiagINC-0.010-1.3.noarch.rpm"
RPM_HASH = "7b13876909698deb0fe647541fffad6c2414f7603914ef2045ccab5a3168e2c260e4ec9db131c47cfd2b7dcd969814a6dee1453de75efd1b95e8a312d6750e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::DiagINC) perl-Test-DiagINC"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
