SUMMARY = "Spiffy Framework with No Source Filtering"
DESCRIPTION = "'Class::Spiffy' is a framework and methodology for doing object oriented \
(OO) programming in Perl. Class::Spiffy combines the best parts of \
Exporter.pm, base.pm, mixin.pm and SUPER.pm into one magic foundation \
class. It attempts to fix all the nits and warts of traditional Perl OO, in \
a clean, straightforward and (perhaps someday) standard way. \
 \
Class::Spiffy borrows ideas from other OO languages like Python, Ruby, Java \
and Perl 6. It also adds a few tricks of its own. \
 \
If you take a look on CPAN, there are a ton of OO related modules. When \
starting a new project, you need to pick the set of modules that makes most \
sense, and then you need to use those modules in each of your classes. \
Class::Spiffy, on the other hand, has everything you'll probably need in \
one module, and you only need to use it once in one of your classes. If you \
make Class::Spiffy the base class of the basest class in your project, \
Class::Spiffy will automatically pass all of its magic to all of your \
subclasses. You may eventually forget that you're even using it!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Class-Spiffy-0.15-138.20.noarch.rpm"
RPM_HASH = "8578243e97432016fef41556d1df7cf53af2d0f0e2e64b2cb34a07b29d7d5405099896c5a7e5d79922fe122a564040498f0c536aca8b6ce24b7156676ca622e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Spiffy) \
perl(Class::Spiffy::mixin) \
perl(DB) \
perl-Class-Spiffy"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
