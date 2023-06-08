SUMMARY = "Ensure that a platform has weaken support"
DESCRIPTION = "One recurring problem in modules that use Scalar::Util's 'weaken' function \
is that it is not present in the pure-perl variant. \
 \
While this isn't necessarily always a problem in a straight CPAN-based Perl \
environment, some operating system distributions only include the pure-Perl \
versions, don't include the XS version, and so weaken is then 'missing' \
from the platform, *despite* passing a dependency on Scalar::Util \
successfully. \
 \
Most notably this is RedHat Linux at time of writing, but other come and go \
and do the same thing, hence 'recurring problem'. \
 \
The normal solution is to manually write tests in each distribution to \
ensure that 'weaken' is available. \
 \
This restores the functionality testing to a dependency you do once in your \
_Makefile.PL_, rather than something you have to write extra tests for each \
time you write a module. \
 \
It should also help make the package auto-generators for the various \
operating systems play more nicely, because it introduces a dependency that \
they *have* to have a proper weaken in order to work."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-Task-Weaken-1.06-2.15.noarch.rpm"
RPM_HASH = "12331b29df18bf611de675c6e49e5e2fe8de067cb365e7f55419e148fbd614015d7baa78164fb4554657c82cdaf59787a0ba1e59456d5d4250713f7780b15c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Task::Weaken) perl-Task-Weaken"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Scalar::Util)"

inherit rpm
