SUMMARY = "X clipboard client"
DESCRIPTION = "xclipboard is used to collect and display text selections that are \
sent to the CLIPBOARD by other clients.  It is typically used to save \
CLIPBOARD selections for later use.  It stores each CLIPBOARD \
selection as a separate string, each of which can be selected."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "xclipboard-1.1.4-1.4.aarch64.rpm"
RPM_HASH = "8c65dd3f99c2dd274a06bf528a66dee269335948ee6ccffbc21555907f9a509771d781530e31e073ed9c666ae17b1ef627dbeaf8e19b4bdcef8cc845725f997c"

RPROVIDES:${PN} += "application() application(xclipboard.desktop) xclipboard xclipboard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXmu.so.6()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
