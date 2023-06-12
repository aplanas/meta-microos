SUMMARY = "Development files for kernelshark"
DESCRIPTION = "Development files for kernelshark"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.2.0"

RPM_NAME = "kernelshark-devel-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "c0d709ef52b351848363a808c0789adbb86106aab7978b56794ab84b158fa3111eb11f8c6c6fb5ec0de0c2f7d94557e8ecd18d9fe50779982321e7b9f4a5c4cc"

RPROVIDES:${PN} += "kernelshark-devel \
kernelshark-devel(aarch-64) \
pkgconfig(libkshark)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernelshark \
pkgconfig(json-c) \
pkgconfig(libtracecmd)"

inherit rpm
