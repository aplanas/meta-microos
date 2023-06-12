SUMMARY = "Set environment and terminal settings to current window size"
DESCRIPTION = "Prints a shell command for setting the appropriate environment variables to \
indicate the current size of the window from which the command is run."
LICENSE = "MIT"

PV = "380"

RPM_NAME = "xterm-resize-380-1.1.aarch64.rpm"
RPM_HASH = "ab343ce8ba934714acf3a8cc0bf04abd93ec842aa3e5643258c3d0e625736584af59c5f57052087e8a9893544128384fa213940e4917fae7ec76d77dd3cfbc29"

RPROVIDES:${PN} += "xterm-resize xterm-resize(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
