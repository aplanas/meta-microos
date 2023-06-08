SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-devel-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "868763ea90488b2e605c38df537699b65ee0ab3a28a74f53d31eb0e2fe15ed9791a9bc1952f072e391c34f820ae5f22b1a2828519ac5bab2738482407b04626f"

RPROVIDES:${PN} += "pkgconfig(libproc2) procps4-devel procps4-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libproc2-0"

inherit rpm
