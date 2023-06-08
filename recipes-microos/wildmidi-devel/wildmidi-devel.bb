SUMMARY = "Development files for wildmidi"
DESCRIPTION = "The wildmidi-devel package contains libraries and header files for \
developing applications that use wildmidi."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "wildmidi-devel-0.4.5-1.3.aarch64.rpm"
RPM_HASH = "684e2037df38e285b7656dd5f8b51f4a169ee42154372e72a962623cf3f4bf1ef45ecd29e2f1e30cd50cd9ad7da50570b7846c331c38889972b430f0d0466eef"

RPROVIDES:${PN} += "cmake(WildMidi) pkgconfig(wildmidi) wildmidi-devel wildmidi-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libWildMidi2"

inherit rpm
