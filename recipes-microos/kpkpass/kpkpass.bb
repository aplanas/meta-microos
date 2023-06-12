SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kpkpass-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3cb241a7064fbd1aeb542373ec1403e5c0356ba3442584da3ce05c02f6c377efc6c1fabbb0912132aeaa9e602f05033044642824521a06c65c70b82d6dfa5130"

RPROVIDES:${PN} += "kpkpass \
kpkpass(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
