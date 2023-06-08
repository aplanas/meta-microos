SUMMARY = "Disables Multidimensional Array Emulation"
DESCRIPTION = "Perl's multidimensional array emulation stems from the days before the \
language had references, but these days it mostly serves to bite you when \
you typo a hash slice by using the '$' sigil instead of '@'. \
 \
This module lexically makes using multidimensional array emulation a fatal \
error at compile time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-multidimensional-0.014-1.26.aarch64.rpm"
RPM_HASH = "4b3e1171739084abb4330800a4007a3d694abba61281a423ff2b5d86dec32ab9db1a42fb324f832d5aa9511f8bfc9e8882113c04f46eceed5671ae1debf25b45"

RPROVIDES:${PN} += "perl(multidimensional) perl-multidimensional perl-multidimensional(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(B::Hooks::OP::Check)"

inherit rpm
