SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7eb95794b17d42e1936cec2e86597eabec4e54e0041bb524548f14319836e17de319d2fbac6a7805300c677c6228b1a0b8193dffc7461fe8015d225f406576d8"

RPROVIDES:${PN} += "qt6-quick3diblbaker-private-devel qt6-quick3diblbaker-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DIblBaker)"

inherit rpm
