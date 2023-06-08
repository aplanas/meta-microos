SUMMARY = "A protocol for redirecting USB traffic - Development files"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "usbredir-devel-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "3421d210beae2c3b20b2084380b5466b4070130ecea3e22ded8344a847d7ca68fd45829be6828806661c367d59f0e77883b12efcd675b84cbfd09a16f18116af"

RPROVIDES:${PN} += "pkgconfig(libusbredirhost) pkgconfig(libusbredirparser-0.5) usbredir-devel usbredir-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libusbredirhost1 libusbredirparser1 pkgconfig(libusb-1.0) pkgconfig(libusbredirparser-0.5)"

inherit rpm
