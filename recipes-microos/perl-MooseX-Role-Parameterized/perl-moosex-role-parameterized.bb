SUMMARY = "Moose roles with composition parameters"
DESCRIPTION = "Your parameterized role consists of two new things: parameter declarations \
and a 'role' block. \
 \
Parameters are declared using the parameter keyword which very much \
resembles Moose/has. You can use any option that Moose/has accepts. The \
default value for the 'is' option is 'ro' as that's a very common case. Use \
'is => 'bare'' if you want no accessor. These parameters will get their \
values when the consuming class (or role) uses Moose/with. A parameter \
object will be constructed with these values, and passed to the 'role' \
block. \
 \
The 'role' block then uses the usual Moose::Role keywords to build up a \
role. You can shift off the parameter object to inspect what the consuming \
class provided as parameters. You use the parameters to customize your role \
however you wish. \
 \
There are many possible implementations for parameterized roles (hopefully \
with a consistent enough API); I believe this to be the easiest and most \
flexible design. Coincidentally, Pugs originally had an eerily similar \
design. \
 \
See MooseX::Role::Parameterized::Extending for some tips on how to extend \
this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.11"

RPM_NAME = "perl-MooseX-Role-Parameterized-1.11-1.15.noarch.rpm"
RPM_HASH = "3b1ae4497bc289247d209427d4354e4c1aa2f3f215400ea11870bb2d30d379753c03afe982961d8f8cebc13a0398a289aa74005b83f26200add6074d68c80fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Role::Parameterised) perl(MooseX::Role::Parameterized) perl(MooseX::Role::Parameterized::Meta::Role::Parameterized) perl(MooseX::Role::Parameterized::Meta::Trait::Parameterizable) perl(MooseX::Role::Parameterized::Meta::Trait::Parameterized) perl(MooseX::Role::Parameterized::Parameters) perl-MooseX-Role-Parameterized"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Module::Runtime) perl(Moose) perl(Moose::Exporter) perl(Moose::Meta::Role) perl(Moose::Role) perl(Moose::Util) perl(namespace::autoclean) perl(namespace::clean)"

inherit rpm
