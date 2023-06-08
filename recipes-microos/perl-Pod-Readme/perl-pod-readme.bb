SUMMARY = "Intelligently generate a README file from POD"
DESCRIPTION = "This module filters POD to generate a _README_ file, by using POD commands \
to specify which parts are included or excluded from the _README_ file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.2.3"

RPM_NAME = "perl-Pod-Readme-1.2.3-1.15.noarch.rpm"
RPM_HASH = "d5046020b2547a0ffc6b118e3c579728cc2ecc06562ff2d87bd42f4ce33434849c44f4e002fc1039f3b7a696254b02148657d15456939774c619633bfede1ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::Readme) perl(Pod::Readme::Filter) perl(Pod::Readme::Plugin) perl(Pod::Readme::Plugin::changes) perl(Pod::Readme::Plugin::requires) perl(Pod::Readme::Plugin::version) perl(Pod::Readme::Types) perl-Pod-Readme"
RDEPENDS:${PN} += "/usr/bin/env perl(:MODULE_COMPAT_5.36.0) perl(CPAN::Changes) perl(CPAN::Meta) perl(Class::Method::Modifiers) perl(File::Slurp) perl(Getopt::Long::Descriptive) perl(List::Util) perl(Module::CoreList) perl(Moo) perl(Moo::Role) perl(MooX::HandlesVia) perl(Path::Tiny) perl(Pod::Simple) perl(Role::Tiny) perl(Try::Tiny) perl(Type::Tiny) perl(Types::Standard) perl(namespace::autoclean)"

inherit rpm
