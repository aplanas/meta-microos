SUMMARY = "Minimalist Fennec, the commonly used bits."
DESCRIPTION = "the Fennec manpage does a ton, but it may be hard to adopt it all at once. \
It also is a large project, and has not yet been fully split into component \
projects. Fennec::Lite takes a minimalist approach to do for Fennec what \
Mouse does for Moose. \
 \
Fennec::Lite is a single module file with no non-core dependencies. It can \
easily be used by any project, either directly, or by copying it into your \
project. The file itself is less than 300 lines of code at the time of this \
writing, that includes whitespace. \
 \
This module does not cover any of the more advanced features such as result \
capturing or SPEC workflows. This module only covers test grouping and \
group randomization. You can also use the FENNEC_ITEM variable with a group \
name or line number to run a specific test group only. Test::Builder is \
used under the hood for TAP output."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-Fennec-Lite-0.004-9.24.noarch.rpm"
RPM_HASH = "ad43fdac73804de16a0c3c36a37a990132b224c2715feb8bf4c6c62b9803d93364b6dcc9acbb5b765015a300718547d079348bdfc9b5564119fec1dc10625135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Fennec::Lite) \
perl-Fennec-Lite"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
