SUMMARY = "HTTP MultiPart Parser"
DESCRIPTION = "This class provides a low-level API for processing MultiPart MIME data \
streams conforming to MultiPart types as defined in at \
http://tools.ietf.org/html/rfc2616#section-3.7.2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-HTTP-MultiPartParser-0.02-1.14.noarch.rpm"
RPM_HASH = "d8682c57fd154896ca62fa356c2c537422ef27b516f44060ac397e35427e390aabd459611bd637a766008dc8d4104bc3aac2259dfca147a24ed53b3169b6756a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::MultiPartParser) perl-HTTP-MultiPartParser"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
