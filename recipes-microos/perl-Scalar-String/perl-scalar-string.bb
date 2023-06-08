SUMMARY = "String Aspects of Scalars"
DESCRIPTION = "This module is about the string part of plain Perl scalars. A scalar has a \
string value, which is notionally a sequence of Unicode codepoints, but may \
be internally encoded in either ISO-8859-1 or UTF-8. In places, and more so \
in older versions of Perl, the internal encoding shows through. To fully \
understand Perl strings it is necessary to understand these implementation \
details. \
 \
This module provides functions to classify a string by encoding and to \
encode a string in a desired way. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Scalar-String-0.003-1.28.aarch64.rpm"
RPM_HASH = "1b32fb4eb9d71511b5febf829571de7ac75398b7aae855ec236d3b3e3b14c24adaad8c317584ee2b480490a5d11bc569450ddc1f8b662a4b8512004b8d8da720"

RPROVIDES:${PN} += "perl(Scalar::String) perl-Scalar-String perl-Scalar-String(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
