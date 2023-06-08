SUMMARY = "Some Moosish Types and a Type Builder"
DESCRIPTION = "This module provides a possibility to build your own set of Moose-like \
types. These custom types can then be used to describe fields in Moo-based \
classes. \
 \
See the MooX::Types::MooseLike::Base manpage for a list of available base \
types. Its source also provides an example of how to build base types, \
along with both parameterizable and non-parameterizable."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.29"

RPM_NAME = "perl-MooX-Types-MooseLike-0.29-1.25.noarch.rpm"
RPM_HASH = "3cbe32462b6ff633660e789ce2a2efd3e9b5ffcd6358e2a8066774bd5b7f775944f4ac286e26ad07c91ea9854f195867cf610fd8e1c422da17ee05eb58b171d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Types::MooseLike) perl(MooX::Types::MooseLike::Base) perl-MooX-Types-MooseLike"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Module::Runtime)"

inherit rpm
