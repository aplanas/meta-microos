SUMMARY = "Parse mime-types, match against media ranges"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of the \
HTTP specification [RFC 2616] for a complete explanation: \
http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006"

RPM_NAME = "perl-Parse-MIME-1.006-1.2.noarch.rpm"
RPM_HASH = "cf4ca358efaee572d3b5ae6365f3859080dd9529810b64ec32de9baa8603a732e8b00c0ca72f8a18e726604fbd276f5178bee4fd8e68c485d18f66c34ed6b122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::MIME) perl-Parse-MIME"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
