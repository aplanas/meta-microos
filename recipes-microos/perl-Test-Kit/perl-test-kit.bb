SUMMARY = "Build custom test packages with only the features you want"
DESCRIPTION = "Test::Kit allows you to create a single module in your project which gives \
you access to all of the testing functions you want. \
 \
Its primary goal is to reduce boilerplate code that is currently littering \
the top of all your test files. \
 \
It also allows your testing to be more consistent; for example it becomes a \
trivial change to include Test::FailWarnings in all of your tests, and \
there is no danger that you forget to include it in a new test."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.15"

RPM_NAME = "perl-Test-Kit-2.15-1.15.noarch.rpm"
RPM_HASH = "fa5b5a094f767505c7a15c3995bf3c4dddc8b3111c32cb91a0ab9611155b6c6f890091388ef39428dac7108ecd1bb8c72658130cfe19c5416aa8d2334fb7c1c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Kit) perl-Test-Kit"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Hook::LexWrap) perl(Import::Into) perl(Module::Runtime) perl(Sub::Delete)"

inherit rpm
