SUMMARY = "Perl extension to test methods for warnings"
DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests. \
 \
This module provides a few convenience methods for testing warning \
based-code. \
 \
If you are not already familiar with the Test::More manpage now would be \
the time to go take a look."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Test-Warn-0.37-1.2.noarch.rpm"
RPM_HASH = "b5cf746bb7d0b9ef320f3d0c40a467b79cbf068220150c2b92d6afedb1cafed9f54f2da6798dcbc0257c53cd3241eb98d1b3aee012b8c3162b98ab560a8e43c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Warn) \
perl(Test::Warn::Categorization) \
perl-Test-Warn"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Carp) \
perl(Sub::Uplevel)"

inherit rpm
