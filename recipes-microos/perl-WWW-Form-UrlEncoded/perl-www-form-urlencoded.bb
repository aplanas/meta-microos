SUMMARY = "Parser and builder for application/x-www-form-urlencoded"
DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser. \
 \
This module try to use WWW::Form::UrlEncoded::XS by default and fail to it, \
use WWW::Form::UrlEncoded::PP instead"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-WWW-Form-UrlEncoded-0.26-1.12.aarch64.rpm"
RPM_HASH = "1b9dae4fcee19596fded1e864c726a80a3e5c68203cc15040ad3db61eaa85d49136f5d40de2e16dbcb8f9613e78cf23c419c5b1718e389b5560171689b216765"

RPROVIDES:${PN} += "perl(WWW::Form::UrlEncoded) perl(WWW::Form::UrlEncoded::PP) perl-WWW-Form-UrlEncoded perl-WWW-Form-UrlEncoded(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
