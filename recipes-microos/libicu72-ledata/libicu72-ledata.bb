SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in little-endian format."
LICENSE = "ICU"

PV = "72.1"

RPM_NAME = "libicu72-ledata-72.1-2.3.noarch.rpm"
RPM_HASH = "319bea454474476c7f814d35548f59b5adfa0847dd7a47e9de3a72abf4db008c57e33d5bcf4753fe98154c13983f4ed18dbd13cf1874a94101a3cd267208571a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu72-ledata"
RDEPENDS:${PN} += ""

inherit rpm
