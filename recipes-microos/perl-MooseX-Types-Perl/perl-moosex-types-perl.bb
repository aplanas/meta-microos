SUMMARY = "Moose types that check against Perl syntax"
DESCRIPTION = "This library provides Moose types for checking things (mostly strings) \
against syntax that is, or is a reasonable subset of, Perl syntax."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.101344"

RPM_NAME = "perl-MooseX-Types-Perl-0.101344-1.2.noarch.rpm"
RPM_HASH = "988baa3ad58368b032dc4f84c9ab9d9c8fcf5bd53d41b1d29dd784aadc8e61c9acbec8f649db8015c849aeb658346887f8fd056666351b2dcbe4c21d0955b41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::Perl) perl-MooseX-Types-Perl"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(MooseX::Types) perl(MooseX::Types::Moose) perl(Params::Util) perl(version)"

inherit rpm
