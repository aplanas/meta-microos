SUMMARY = "RMT pubcloud extensions"
DESCRIPTION = "This package extends the basic RMT functionality with capabilities \
required for public cloud environments."
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "rmt-server-pubcloud-2.12-1.1.aarch64.rpm"
RPM_HASH = "572e74390a134f878dd87ecb9cfb5d36aa7adb1b81fd655a775aa5ca08db9652e68377d620a61881efcc8882333509f244bd457875a96e1b5611ede4db0f73ff"

RPROVIDES:${PN} += "config(rmt-server-pubcloud) rmt-server-configuration rmt-server-pubcloud rmt-server-pubcloud(aarch-64)"
RDEPENDS:${PN} += "/bin/sh rmt-server"

inherit rpm
