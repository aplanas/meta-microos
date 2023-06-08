SUMMARY = "Extensions to L<PPI|PPI>"
DESCRIPTION = "This is a collection of functions for dealing with PPI objects, many of \
which originated in Perl::Critic. They are organized into modules by the \
kind of PPI class they relate to, by replacing the 'PPI' at the front of \
the module name with 'PPIx::Utilities', e.g. functionality related to \
PPI::Nodes is in PPIx::Utilities::Node."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.001000"

RPM_NAME = "perl-PPIx-Utilities-1.001000-14.15.noarch.rpm"
RPM_HASH = "e23045ec6e99a24e3b61c3ea51c0cc2dbf30ec48fd1870dd1e1328c5d2fad28b32f19f98c8e5cb0af9c727bf915484ae396a40b7169985309d58c5e0a54b182d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PPIx::Utilities) perl(PPIx::Utilities::Exception::Bug) perl(PPIx::Utilities::Node) perl(PPIx::Utilities::Statement) perl-PPIx-Utilities"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Exception::Class) perl(PPI) perl(PPI::Document::Fragment) perl(Readonly) perl(Task::Weaken)"

inherit rpm
