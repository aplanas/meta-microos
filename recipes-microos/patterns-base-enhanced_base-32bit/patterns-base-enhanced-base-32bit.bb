SUMMARY = "Enhanced Base System"
DESCRIPTION = "The 32bit pattern complementing enhanced_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "48f7e13e36dd8cb755ed1a097ee961e3d4912bedecb4d06fbf22608e33ee194697f356535ed8c7ef969d1c7940d32425867a8eb11577a375a31fca740c5800c3"

RPROVIDES:${PN} += "pattern() patterns-base-enhanced_base-32bit patterns-base-enhanced_base-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
