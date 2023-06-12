SUMMARY = "Basic cross-platform tests for scripts"
DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% of \
the testing you will need to do for scripts in the _script_ (or _bin_ as is \
also commonly used) paths of your Perl distribution. \
 \
It also provides similar functions for testing programs that are not Perl \
scripts. \
 \
Further, it aims to provide this functionality with perfect \
platform-compatibility, and in a way that is as unobtrusive as possible. \
 \
That is, if the program works on a platform, then *Test::Script* should \
always work on that platform as well. Anything less than 100% is considered \
unacceptable. \
 \
In doing so, it is hoped that *Test::Script* can become a module that you \
can safely make a dependency of all your modules, without risking that your \
module won't on some platform because of the dependency. \
 \
Where a clash exists between wanting more functionality and maintaining \
platform safety, this module will err on the side of platform safety."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Test-Script-1.29-1.9.noarch.rpm"
RPM_HASH = "b87a0d502d6c9a7b7aa615b03c9dcc4c561c40de5143a73cdc3bb29dfea79be0cf73c64a00409b1a676ae32a71d45bffeef080e601dc290086ff3228328c72b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Script) \
perl-Test-Script"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Capture::Tiny) \
perl(Probe::Perl) \
perl(Test2::API)"

inherit rpm
