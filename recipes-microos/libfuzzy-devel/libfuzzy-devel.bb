SUMMARY = "API for ssdeep"
DESCRIPTION = "Devel API for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy-devel-2.14.1-1.23.aarch64.rpm"
RPM_HASH = "8cbd9de58e790dd166845fdb67b5d7cb264cc41dcb165525e9a80b3cb3fe70394996f915de6b432c400cfa2463f81b8e5e6b0260a8381e87ffe56c3f44395d83"

RPROVIDES:${PN} += "libfuzzy-devel \
libfuzzy-devel(aarch-64)"
RDEPENDS:${PN} += "libfuzzy2"

inherit rpm
