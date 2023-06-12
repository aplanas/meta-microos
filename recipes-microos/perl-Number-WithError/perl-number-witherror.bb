SUMMARY = "Numbers with error propagation and scientific rounding"
DESCRIPTION = "This class is a container class for numbers with a number of associated \
symmetric and asymmetric errors. It overloads practically all common \
arithmetic operations and trigonometric functions to propagate the errors. \
It can do proper scientific rounding (as explained in more detail below in \
the documentation of the 'significant_digit()' method). \
 \
You can use Math::BigFloat objects as the internal representation of \
numbers in order to support arbitrary precision calculations. \
 \
Errors are propagated using Gaussian error propagation. \
 \
With a notable exception, the test suite covers way over ninety percent of \
the code. The remaining holes are mostly difficult-to-test corner cases and \
sanity tests. The comparison routines are the exception for which there \
will be more extensive tests in a future release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Number-WithError-1.01-1.17.noarch.rpm"
RPM_HASH = "dba206589cc0c21affa3a63f7dfc32ac802ce52bcd890e58ba8fbbdbdf0aee40672b3e64b53a2812964fd3ed51f14e3b7ea3b819469db774fb3460b85bd5b0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Number::WithError) \
perl-Number-WithError"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Params::Util) \
perl(prefork)"

inherit rpm
