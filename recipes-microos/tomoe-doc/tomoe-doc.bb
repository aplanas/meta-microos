SUMMARY = "Documentation for the Tomoe handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-doc-0.6.0-51.4.aarch64.rpm"
RPM_HASH = "9bfdd19a356ddf9fe988aedf08ce0a97024f55e2413522808aaba6826514d7281e81df8a4240bca7aac5200ab5b3147e6aace477097640bd174a212ae47107b7"

RPROVIDES:${PN} += "tomoe-doc tomoe-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
