SUMMARY = "Return a pair only if they are both defined"
DESCRIPTION = "Moose classes (and some other classes) distinguish between an attribute \
being unset and the attribute being set to undef. Supplying a constructor \
arguments like this: \
 \
 my $bob = Person->new( \
    name => $name, \
    age => $age, \
 ); \
 \
Will result in the 'name' and 'age' attributes possibly being set to undef \
(if the corresponding '$name' and '$age' variables are not defined), which \
may violate the Person class' type constraints. \
 \
(Note: if you are the _author_ of the class in question, you can solve this \
using MooseX::UndefTolerant. However, some of us are stuck using \
non-UndefTolerant classes written by third parties.) \
 \
To ensure that the Person constructor does not try to set a name or age at \
all when they are undefined, ugly looking code like this is often used: \
 \
 my $bob = Person->new( \
    defined $name ? (name => $name) : (), \
    defined $age ? (age => $age) : (), \
 ); \
 \
or: \
 \
 my $bob = Person->new( \
    (name => $name) x!!(defined $name), \
    (age  => $age)  x!!(defined $age), \
 ); \
 \
A slightly more elegant solution is the 'maybe' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.202"

RPM_NAME = "perl-PerlX-Maybe-1.202-1.7.noarch.rpm"
RPM_HASH = "f398c5a32d02b78035cf1e302eb694edffbb6b69bb54b2b1560ccf69e4a4bd85867638c5441a0535b076aa0b2d238064960126d76dbb00cfd00e99e213957dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PerlX::Maybe) perl(Syntax::Feature::Maybe) perl-PerlX-Maybe"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
