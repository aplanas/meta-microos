SUMMARY = "Minimalist Object Orientation (with Moose compatibility)"
DESCRIPTION = "'Moo' is an extremely light-weight Object Orientation system. It allows one \
to concisely define objects and roles with a convenient syntax that avoids \
the details of Perl's object system. 'Moo' contains a subset of Moose and \
is optimised for rapid startup. \
 \
'Moo' avoids depending on any XS modules to allow for simple deployments. \
The name 'Moo' is based on the idea that it provides almost -- but not \
quite -- two thirds of Moose. As such, the Moose::Manual can serve as an \
effective guide to 'Moo' aside from the MOP and Types sections. \
 \
Unlike Mouse this module does not aim at full compatibility with Moose's \
surface syntax, preferring instead to provide full interoperability via the \
metaclass inflation capabilities described in MOO AND MOOSE. \
 \
For a full list of the minor differences between Moose and Moo's surface \
syntax, see INCOMPATIBILITIES WITH MOOSE."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.005005"

RPM_NAME = "perl-Moo-2.005005-1.1.noarch.rpm"
RPM_HASH = "13e494db03ac11d9d7198a407633e36e98c0adaf539da92ba7a1c0132994c1a33c741f97f3f6f2cce79550c25b2d0f3f2660d28df9d912b4edfba6b5d978d7b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Method::Generate::Accessor) perl(Method::Generate::BuildAll) perl(Method::Generate::Constructor) perl(Method::Generate::DemolishAll) perl(Moo) perl(Moo::HandleMoose) perl(Moo::HandleMoose::FakeConstructor) perl(Moo::HandleMoose::FakeMetaClass) perl(Moo::HandleMoose::_TypeMap) perl(Moo::Object) perl(Moo::Role) perl(Moo::_Utils) perl(Moo::sification) perl(oo) perl-Moo"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Method::Modifiers) perl(Role::Tiny) perl(Sub::Defer) perl(Sub::Quote)"

inherit rpm
