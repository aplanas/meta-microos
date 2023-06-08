SUMMARY = "Lightweight pure-perl XML Parser (based on regexps)"
DESCRIPTION = "This module implements an XML parser with a interface similar to \
XML::Parser. Though not all callbacks are supported, you should be able to \
use it in the same way you use XML::Parser. Due to using experimental \
regexp features it'll work only on Perl 5.6 and above and may behave \
differently on different platforms. \
 \
Note that you cannot use regular expressions or split in callbacks. This is \
due to a limitation of perl's regular expression implementation (which is \
not re-entrant)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.722"

RPM_NAME = "perl-XML-Parser-Lite-0.722-1.16.noarch.rpm"
RPM_HASH = "4d9982a9d84ec973bd01d9bfeed45523ce34a2a8febb90b141f08cd8057c55080e7c7f2df436d43eb56e738b918a65e5131ac35e375e8e518d05ec1ebd046435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Parser::Lite) perl-XML-Parser-Lite"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
