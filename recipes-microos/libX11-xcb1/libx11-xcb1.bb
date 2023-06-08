SUMMARY = "XCB X11 protocol client library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "libX11-xcb1-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "90f97abc1602ebe99fcd3a92aa9657bd44003ac2777fe55036f2ee442a91746a3c98dbc5fcfa63d6d5695e020ea68df1bc5811e514352d905dec4598799467f8"

RPROVIDES:${PN} += "libX11-xcb.so.1()(64bit) libX11-xcb1 libX11-xcb1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libX11-data"

inherit rpm
