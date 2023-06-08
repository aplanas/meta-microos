SUMMARY = "(DEPRECATED) Roles which support overloading"
DESCRIPTION = "MooseX::Role::WithOverloading allows you to write a the Moose::Role manpage \
which defines overloaded operators and allows those overload methods to be \
composed into the classes/roles/instances it's compiled to, where plain the \
Moose::Role manpages would lose the overloading. \
 \
Starting with the Moose manpage version 2.1300, this module is no longer \
necessary, as the functionality is available already. In that case, 'use \
MooseX::Role::WithOverloading' behaves identically to 'use Moose::Role'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-MooseX-Role-WithOverloading-0.17-1.33.aarch64.rpm"
RPM_HASH = "e9ae60205f26ff55d04b8ff1bf4d7405735fbabf91ed5f4f05c1511edc5b795c2e32ab4782f8b7c829eaeb6042e50b14526da5db7c901048c51bd5ca117000a5"

RPROVIDES:${PN} += "perl(MooseX::Role::WithOverloading) perl(MooseX::Role::WithOverloading::Meta::Role) perl(MooseX::Role::WithOverloading::Meta::Role::Application) perl(MooseX::Role::WithOverloading::Meta::Role::Application::Composite) perl(MooseX::Role::WithOverloading::Meta::Role::Application::Composite::ToClass) perl(MooseX::Role::WithOverloading::Meta::Role::Application::Composite::ToInstance) perl(MooseX::Role::WithOverloading::Meta::Role::Application::Composite::ToRole) perl(MooseX::Role::WithOverloading::Meta::Role::Application::FixOverloadedRefs) perl(MooseX::Role::WithOverloading::Meta::Role::Application::ToClass) perl(MooseX::Role::WithOverloading::Meta::Role::Application::ToInstance) perl(MooseX::Role::WithOverloading::Meta::Role::Application::ToRole) perl(MooseX::Role::WithOverloading::Meta::Role::Composite) perl-MooseX-Role-WithOverloading perl-MooseX-Role-WithOverloading(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose) perl(Moose::Exporter) perl(Moose::Role) perl(aliased) perl(namespace::autoclean) perl(namespace::clean)"

inherit rpm
