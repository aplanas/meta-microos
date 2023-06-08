SUMMARY = "Class providing URI query string manipulation"
DESCRIPTION = "URI::Query provides simple URI query string manipulation, allowing you to \
create and manipulate URI query strings from GET and POST requests in web \
applications. This is primarily useful for creating links where you wish to \
preserve some subset of the parameters to the current request, and \
potentially add or replace others. Given a query string this is doable with \
regexes, of course, but making sure you get the anchoring and escaping \
right is tedious and error-prone - this module is simpler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-URI-Query-0.16-1.10.noarch.rpm"
RPM_HASH = "3eb2a0756b131ea0c06803e1e7e2227ba3084efffce5c0dfca19d77b6032950f028862e7acc43dbffc125e4861018bd16ceddb7308b049229a877961a83a0ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::Query) perl-URI-Query"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Clone) perl(URI::Escape) perl(parent)"

inherit rpm
