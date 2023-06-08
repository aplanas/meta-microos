SUMMARY = "The GNU TetriNET server"
DESCRIPTION = "Tetrinetx-qirc1.40c with Async DNS support for high productivity \
server."
LICENSE = "GPL-2.0-or-later"

PV = "1.13.16"

RPM_NAME = "tetrinet-server-1.13.16-343.13.aarch64.rpm"
RPM_HASH = "dceb006bb83871fd8217cca675587845cc22f262352834766c3dc9d378b623b2951654f33f4ab8b49fa799372a43eafb30d30ef25b684bc4e223a3b3db580ddc"

RPROVIDES:${PN} += "tetrinet-server tetrinet-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadns.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
