SUMMARY = "Development files for hamlib, a set of radio control libraries"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "hamlib-devel-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "2eabc5ceea0de3861ebaa7ad360bdbc82469a4976ab9a5c5a4a8981f20b3dbcb7348736101e1b900b10e03819a2a9e599fff594b8e0abd3c4f9e7f71a94ea4a4"

RPROVIDES:${PN} += "hamlib-devel hamlib-devel(aarch-64) pkgconfig(hamlib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhamlib++4 libhamlib4 pkgconfig(libusb-1.0)"

inherit rpm
