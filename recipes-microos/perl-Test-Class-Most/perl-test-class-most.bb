SUMMARY = "Test Classes the easy way"
DESCRIPTION = "When people write test classes with the excellent 'Test::Class', you often \
see the following at the top of the code: \
 \
  package Some::Test::Class; \
 \
  use strict; \
  use warnings; \
  use base 'My::Test::Class'; \
  use Test::More; \
  use Test::Exception; \
 \
   \
 \
That's a lot of boilerplate and I don't like boilerplate. So now you can do \
this: \
 \
  use Test::Class::Most parent => 'My::Test::Class'; \
 \
That automatically imports the strict manpage and the warnings manpage for \
you. It also gives you all of the testing goodness from the Test::Most \
manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Test-Class-Most-0.08-1.23.noarch.rpm"
RPM_HASH = "bbcc3616e79ce96db02f9fa4f48d09ea1f57def83794c72c3636e8581e8cf6f3d2c99136eb98771b722e2a4eae37b4826574f84b6ae5cf4269cd554f9dc5d421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Class::Most) perl-Test-Class-Most"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test::Class) perl(Test::Most)"

inherit rpm
