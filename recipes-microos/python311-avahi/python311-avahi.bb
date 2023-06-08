SUMMARY = "A set of Avahi utilities written in Python"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "python311-avahi-0.8-23.1.aarch64.rpm"
RPM_HASH = "f3d754af9ab88fafc568e5daee0d7b311c40a6d9740fc10f76db7d0db5f6c403c583d6ed2142bc1759b0a48a632f02ebe4736788a31ef1e206c2cf8bb5339168"

RPROVIDES:${PN} += "python311-avahi python311-avahi(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 avahi python(abi) python311-Twisted python311-dbm python311-dbus-python"

inherit rpm
