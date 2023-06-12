SUMMARY = "Assert the Referential Identity of a Reference"
DESCRIPTION = "This module provides a single testing function, 'identical'. It asserts \
that a given reference is as expected; that is, it either refers to the \
same object or is 'undef'. It is similar to 'Test::More::is' except that it \
uses 'refaddr', ensuring that it behaves correctly even if the references \
under test are objects that overload stringification or numification. \
 \
It also provides better diagnostics if the test fails: \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], {}' \
 1..1 \
 not ok 1 \
  \
  \
  \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], []' \
 1..1 \
 not ok 1"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-Test-Identity-0.01-1.24.noarch.rpm"
RPM_HASH = "c8191ae1a80f8069e888722ea84f5b8f222d2a9287240275c36aae5693f99085a953a524cda3db3ef4636e39b7ccefce764019426db9f15d110661dff59f242c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Identity) \
perl-Test-Identity"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
