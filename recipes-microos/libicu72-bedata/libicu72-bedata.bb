SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in big-endian format."
LICENSE = "ICU"

PV = "72.1"

RPM_NAME = "libicu72-bedata-72.1-2.3.noarch.rpm"
RPM_HASH = "3ef5cc4f4713fed00e758f9895d7c8018ea02160616fc66216e9249d534332db948032942071f2eacd1790b0d7efb70bebd15aedee250876ef61a877c65b1d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu72-bedata"
RDEPENDS:${PN} += ""

inherit rpm
