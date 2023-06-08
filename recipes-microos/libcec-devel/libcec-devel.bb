SUMMARY = "Development files for the USB CEC adapter communication library"
DESCRIPTION = "libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This subpackage contains the headers for libcec."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "libcec-devel-6.0.2-2.9.aarch64.rpm"
RPM_HASH = "db4fc492bd2006ab0ebc0234e85f4f2a007e5e91eb7236fad2a4dbe88dd068faa280d2443f4c85607d68873f3311a8607efd35e39f4c3fc4bfe88810a7ccf03b"

RPROVIDES:${PN} += "libcec-devel libcec-devel(aarch-64) pkgconfig(libcec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcec6 pkgconfig(p8-platform)"

inherit rpm
