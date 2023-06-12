SUMMARY = "RMT pubcloud extensions"
DESCRIPTION = "This package extends the basic RMT functionality with capabilities \
required for public cloud environments."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-pubcloud-2.13-1.1.aarch64.rpm"
RPM_HASH = "98b48424ecebea142e1ab0bbdaa7c0a15635d367a1266db821522e607763cfb96ef42d7f05d6355b1dc632e3630ba96fcf285a19af8e4268fa84ff5cd10a1d63"

RPROVIDES:${PN} += "config(rmt-server-pubcloud) rmt-server-configuration rmt-server-pubcloud rmt-server-pubcloud(aarch-64)"
RDEPENDS:${PN} += "/bin/sh rmt-server"

inherit rpm
