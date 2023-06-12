SUMMARY = "A protocol for redirecting USB traffic"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "usbredir-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "452f65b58046b388f6587df19fcb9929679b26edf06cf3b50ff0299c85706ca9afd0ff1e7646c9b97be7e5d5fbcc2c02e1df23bd7b3352857441836548e7f133"

RPROVIDES:${PN} += "usbredir \
usbredir(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libusb-1.0.so.0()(64bit) \
libusbredirhost.so.1()(64bit) \
libusbredirhost.so.1(USBREDIRHOST_0.8.0)(64bit)"

inherit rpm
