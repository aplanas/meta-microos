SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-doc-9.3.0-1.1.noarch.rpm"
RPM_HASH = "0f882b01d1e927649a28b3173019f3c0a9438619b71e72a313a5b96f863d60ff2e7bca15c65b403a42850cac2da9058d50a300a771b3958e442e1962f73874c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"
RDEPENDS:${PN} += ""

inherit rpm
