SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "libsuseconnect-1.1.0~git0.e3c41e60892e-1.1.aarch64.rpm"
RPM_HASH = "569bfefd82e60cb61010841d55861cad010f143f8e0e2e7d8cfb51f5f48e0070caa34139f3f5d142ce2df8345c3b4a3eecf6d34f93cce4e0c2d505e3c34a8adb"

RPROVIDES:${PN} += "libsuseconnect libsuseconnect(aarch-64)"
RDEPENDS:${PN} += "suseconnect-ng"

inherit rpm
