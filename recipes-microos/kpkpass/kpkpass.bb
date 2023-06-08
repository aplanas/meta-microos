SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kpkpass-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "22d13301ee0d5ad57bcef150a84d40473a6b423b8020e397514c8b380b99af60f8577287fd95c86f6a1ba0616b60c0a6c378d173d030dc9f776c42773a80526f"

RPROVIDES:${PN} += "kpkpass kpkpass(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
