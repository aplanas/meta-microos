SUMMARY = "Store a Moose object in glob reference"
DESCRIPTION = "This module allows to store Moose object in glob reference of file handle. \
The class attributes will be stored in hash slot associated with glob \
reference. It allows to create a Moose version of the IO::Handle manpage. \
 \
The attributes can be accessed directly with following expression: \
 \
  my $hashref = \\%{*$self}; \
  print $hashref->{key}; \
 \
or shorter: \
 \
  print *$self->{key}; \
 \
but the standard accessors should be used instead: \
 \
  print $self->key;"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.0701"

RPM_NAME = "perl-MooseX-GlobRef-0.0701-9.24.noarch.rpm"
RPM_HASH = "39a8e08a1697bdc1bb5496bf13cc8d60dd5a3624dfa6898d935691798f7a7e60594608d257ee2eec0cfa70aae5ff6c6d29f85422e7374afac6d7b431b92bbaeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::GlobRef) perl(MooseX::GlobRef::Object) perl(MooseX::GlobRef::Role::Meta::Instance) perl(MooseX::GlobRef::Role::Object) perl-MooseX-GlobRef"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose)"

inherit rpm
