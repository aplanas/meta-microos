SUMMARY = "Path::Tiny types and coercions for Moose"
DESCRIPTION = "This module provides Path::Tiny types for Moose. It handles two important \
types of coercion: \
 \
  * coercing objects with overloaded stringification \
 \
  * coercing to absolute paths \
 \
It also can check to ensure that files or directories exist."
LICENSE = "Apache-2.0"

PV = "0.012"

RPM_NAME = "perl-MooseX-Types-Path-Tiny-0.012-1.21.noarch.rpm"
RPM_HASH = "fc90e08d011c190d5f6409665c0260a81441b00d7b26f69a795236b4c982335aaaf0f8d4776ec2b6ce08f6ab707da8e034dbe82282ae4194551b9eb281fcb71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::Path::Tiny) perl-MooseX-Types-Path-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose) perl(MooseX::Getopt) perl(MooseX::Types) perl(MooseX::Types::Moose) perl(MooseX::Types::Stringlike) perl(Path::Tiny) perl(namespace::autoclean)"

inherit rpm
