SUMMARY = "Write tests in a declarative specification style"
DESCRIPTION = "This is a declarative specification-style testing system for \
behavior-driven development (BDD) in Perl. The tests (a.k.a. examples) are \
named with strings instead of subroutine names, so your fingers will suffer \
less fatigue from underscore-itis, with the side benefit that the test \
reports are more legible. \
 \
This module is inspired by and borrows heavily from at \
http://rspec.info/documentation, a BDD tool for the Ruby programming \
language."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-Test-Spec-0.54-1.16.noarch.rpm"
RPM_HASH = "5e9daa3955df299777e3191418cf230b376bee6f97a49917cfdbf8e6ffa06d43953550087e5560f89146131979e112268964ecc81fd0663635ce2750446ab74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Spec) \
perl(Test::Spec::Context) \
perl(Test::Spec::Example) \
perl(Test::Spec::ExportProxy) \
perl(Test::Spec::Mocks) \
perl(Test::Spec::Mocks::Expectation) \
perl(Test::Spec::Mocks::MockObject) \
perl(Test::Spec::Mocks::Stub) \
perl(Test::Spec::SharedHash) \
perl(Test::Spec::TodoExample) \
perl-Test-Spec"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::GlobalPhase) \
perl(Package::Stash) \
perl(TAP::Parser) \
perl(Test::Deep) \
perl(Test::More) \
perl(Test::Trap) \
perl(Tie::IxHash)"

inherit rpm
