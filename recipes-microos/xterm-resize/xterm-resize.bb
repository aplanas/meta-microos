SUMMARY = "Set environment and terminal settings to current window size"
DESCRIPTION = "Prints a shell command for setting the appropriate environment variables to \
indicate the current size of the window from which the command is run."
LICENSE = "MIT"

PV = "379"

RPM_NAME = "xterm-resize-379-1.3.aarch64.rpm"
RPM_HASH = "db02176bddfb7bd34c4c12e0b6d6552c7dd1600225808608d53d080452fa1162fcdfe5b780fe461dc6d54c78213004b43003380f21a7834bb7c4aa4fda2345c9"

RPROVIDES:${PN} += "xterm-resize xterm-resize(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
