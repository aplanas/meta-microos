SUMMARY = "Track the number of times subs are called"
DESCRIPTION = "There are a number of different situations (like testing caching code) \
where you want to want to do a number of tests, and then verify that some \
underlying subroutine deep within the code was called a specific number of \
times. \
 \
This module provides a number of functions for doing testing in this way in \
association with your normal Test::More (or similar) test scripts."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.10"

RPM_NAME = "perl-Test-SubCalls-1.10-1.19.noarch.rpm"
RPM_HASH = "296c9c0f1c1ec456bfb3ab662744b748323c92f070dfc6f1f99ac99e061c6c069251f8bb13c08b4617713f6161e27005b715d545055851e3a50c54dd1a0789c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::SubCalls) \
perl-Test-SubCalls"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Hook::LexWrap)"

inherit rpm
