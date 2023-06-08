SUMMARY = "Parses .pm file as PAUSE does"
DESCRIPTION = "The most of the code of this module is taken from the PAUSE code as of \
April 2013 almost verbatim. Thus, the heart of this module should be quite \
stable. However, I made it not to use pipe ('-|') as well as I stripped \
database-related code. If you encounter any issue, that's most probably \
because of my modification. \
 \
This module doesn't provide features to extract a distribution or parse \
meta files intentionally."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Parse-PMFile-0.44-1.1.noarch.rpm"
RPM_HASH = "dff6107dcd521490922caffd9e831383bf94acdff8a96bc29c7982344eed4977e6ae56c291e04e2c0f9f46b0715636276e08848fd8d70830153ec1af8f32878b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::PMFile) perl-Parse-PMFile"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(JSON::PP) perl(version)"

inherit rpm
