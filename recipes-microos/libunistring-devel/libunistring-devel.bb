SUMMARY = "Development files for the GNU Unicode string library"
DESCRIPTION = "Development files for programs using libunistring and documentation \
for UniString library."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "libunistring-devel-1.1-2.1.aarch64.rpm"
RPM_HASH = "0afad8ac7272c2cbff597c5b897d1765975514aae678362b0c5028bdfe89a4536c399de419ac61e219b996d268a7f611c2f5f58f944d615546289cda2c429f14"

RPROVIDES:${PN} += "libunistring-devel \
libunistring-devel(aarch-64)"
RDEPENDS:${PN} += "libunistring5"

inherit rpm
