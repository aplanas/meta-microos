SUMMARY = "Parse and format W3CDTF datetime strings"
DESCRIPTION = "This module understands the W3CDTF date/time format, an ISO 8601 profile, \
defined at http://www.w3.org/TR/NOTE-datetime. This format as the native \
date format of RSS 1.0. \
 \
It can be used to parse these formats in order to create the appropriate \
objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-DateTime-Format-W3CDTF-0.08-1.11.noarch.rpm"
RPM_HASH = "0e07820178822e267ab9ab7adbabc1fb9e1d67669a38adc566a7e8ab4169190b0d3fc3b3de2f0b5293059cb6177b20f1897a48a2a244274d4fcb477020b11de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::W3CDTF) perl-DateTime-Format-W3CDTF"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DateTime)"

inherit rpm
