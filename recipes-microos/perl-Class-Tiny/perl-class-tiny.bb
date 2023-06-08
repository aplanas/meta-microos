SUMMARY = "Minimalist class construction"
DESCRIPTION = "This module offers a minimalist class construction kit in around 120 lines \
of code. Here is a list of features: \
 \
  * defines attributes via import arguments \
 \
  * generates read-write accessors \
 \
  * supports lazy attribute defaults \
 \
  * supports custom accessors \
 \
  * superclass provides a standard 'new' constructor \
 \
  * 'new' takes a hash reference or list of key/value pairs \
 \
  * 'new' supports providing 'BUILDARGS' to customize constructor options \
 \
  * 'new' calls 'BUILD' for each class from parent to child \
 \
  * superclass provides a 'DESTROY' method \
 \
  * 'DESTROY' calls 'DEMOLISH' for each class from child to parent \
 \
Multiple-inheritance is possible, with superclass order determined via \
mro::get_linear_isa. \
 \
It uses no non-core modules for any recent Perl. On Perls older than v5.10 \
it requires MRO::Compat. On Perls older than v5.14, it requires \
Devel::GlobalDestruction."
LICENSE = "Apache-2.0"

PV = "1.008"

RPM_NAME = "perl-Class-Tiny-1.008-1.12.noarch.rpm"
RPM_HASH = "47aef258cdda02b327041c27c882fcf1b93c1f9141bc95608da5bd02f3a7fc889a5e0b73e821e34a3be81fa63a5a7ee7e934d82eca17a93550564358c9974f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Tiny) perl(Class::Tiny::Object) perl-Class-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
