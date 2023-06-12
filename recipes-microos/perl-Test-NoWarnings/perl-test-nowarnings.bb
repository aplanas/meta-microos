SUMMARY = "Make sure you didn't emit any warnings while testing"
DESCRIPTION = "In general, your tests shouldn't produce warnings. This modules causes any \
warnings to be captured and stored. It automatically adds an extra test \
that will run when your script ends to check that there were no warnings. \
If there were any warnings, the test will give a 'not ok' and diagnostics \
of where, when and what the warning was, including a stack trace of what \
was going on when the it occurred. \
 \
If some of your tests *are supposed to* produce warnings then you should be \
capturing and checking them with Test::Warn, that way Test::NoWarnings will \
not see them and so not complain. \
 \
The test is run by an 'END' block in Test::NoWarnings. It will not be run \
when any forked children exit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.06"

RPM_NAME = "perl-Test-NoWarnings-1.06-1.9.noarch.rpm"
RPM_HASH = "f3f3e65ca89756b30c53dd2ac1366127bb2d62ca2b591ee5fb408232848236a1ceb64dd951caf4969be922300d8a8f985b710034f731fb4b8161c41d86af7a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::NoWarnings) \
perl(Test::NoWarnings::Warning) \
perl-Test-NoWarnings"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::Builder)"

inherit rpm
