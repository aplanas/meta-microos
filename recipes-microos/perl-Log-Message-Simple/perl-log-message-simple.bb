SUMMARY = "Simplified interface to Log::Message"
DESCRIPTION = "This module provides standardized logging facilities using the \
'Log::Message' module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Log-Message-Simple-0.10-3.26.noarch.rpm"
RPM_HASH = "86f6536aa557b697b5c5827c93063756134b2071143f892276242cc10fad755bcfb8aa82f9c7c877fe29cf312cd84c1c808d3d17b4cd65f1fa4aeef4dd7ee7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Message::Simple) perl-Log-Message-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Log::Message)"

inherit rpm
