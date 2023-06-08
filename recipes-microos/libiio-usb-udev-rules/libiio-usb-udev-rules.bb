SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains a udev rule for granting access to IIO targets \
using the USB transport/backend."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-usb-udev-rules-0.24-1.4.aarch64.rpm"
RPM_HASH = "74c437fa90029d07b2e04f7a0b91bffe378eeab151a05da6761f855f3d10289b1625a01fc4fe288ebc6a189630b264833e16245fe97b80d8d48319f807213bac"

RPROVIDES:${PN} += "libiio-usb-udev-rules libiio-usb-udev-rules(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
