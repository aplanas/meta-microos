SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "gupnp-av-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "69b17092300bb0fe48597d679d2c27c788144948aad80a99735cd60cb240d2bfa3f0c687f2495513a5aa43d457e87386b107a720bb6456fdec091adacf4dea17"

RPROVIDES:${PN} += "gupnp-av gupnp-av(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
