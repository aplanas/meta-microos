SUMMARY = "Alternative status bar for i3"
DESCRIPTION = "i3blocks is a flexible status line for the i3 window manager. It handles \
clicks, signals and language-agnostic user scripts. \
 \
The content of each block (e.g. time, battery status, network state, ...) is \
the output of a command provided by the user. Blocks are updated on click, at a \
given interval of time or on a given signal, also specified by the user. \
 \
It follows the i3bar protocol, providing customization such as text \
alignment, urgency and color."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "i3blocks-1.5-2.8.aarch64.rpm"
RPM_HASH = "d8f684220f1b88a3ed81eda2755acdaa1ca73d73c3ab9abbf3b1d0287cb9bfb43aa4da980bd3d40c4127f3dcf14c47dd83bbf6ea85d66e5dcea9e831a2c82070"

RPROVIDES:${PN} += "config(i3blocks) i3blocks i3blocks(aarch-64)"
RDEPENDS:${PN} += "acpi alsa-utils i3 iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) xclip"

inherit rpm
