SUMMARY = "Error/exception handling in an OO-ish way"
DESCRIPTION = "The 'Error' package provides two interfaces. Firstly 'Error' provides a \
procedural interface to exception handling. Secondly 'Error' is a base \
class for errors/exceptions that can either be thrown, for subsequent \
catch, or can simply be recorded. \
 \
Errors in the class 'Error' should not be thrown directly, but the user \
should throw errors from a sub-class of 'Error'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17029"

RPM_NAME = "perl-Error-0.17029-1.13.noarch.rpm"
RPM_HASH = "371437820837c384775eca219a5164ebdda6db3a32c944d8bb945103a751e1e52d9b218f0c1e18ee2645a83ee3bc5963e1ec16408b99989ad1db55b742fed791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Error) perl(Error::Simple) perl(Error::WarnDie) perl(Error::subs) perl-Error"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
