SUMMARY = "Nimbus Metatheme for GNOME"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0+"

PV = "0.1.7"

RPM_NAME = "gtk2-metatheme-nimbus-0.1.7-13.28.aarch64.rpm"
RPM_HASH = "5c13dff6081496d2f6d1fb087d7f74d27a7edc5080b85fbc77a110a604c66fa2ff3c4a864f546f7ea47ca362b44285e3224dc11d98e8d555c5a64611b659fa45"

RPROVIDES:${PN} += "gtk2-metatheme-nimbus \
gtk2-metatheme-nimbus(aarch-64)"
RDEPENDS:${PN} += "gtk2-engine-nimbus \
nimbus-icon-theme"

inherit rpm
