SUMMARY = "Object for handling URI templates (RFC 6570)"
DESCRIPTION = "This module provides a wrapper around URI templates as described in RFC \
6570: http://tools.ietf.org/html/rfc6570."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-URI-Template-0.24-1.15.noarch.rpm"
RPM_HASH = "5351b871f71e9868e7ceff147706ef301e61916fc3a1c58df776573cd0181b794bbf374c2abf5d1da4e563b0f67da913d08e72c34b921dd0b5069a8d2b2d5551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::Template) perl-URI-Template"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(URI) perl(URI::Escape)"

inherit rpm
