SUMMARY = "Generic Linux input driver for the Xorg X server -- Development Files"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.10.6"

RPM_NAME = "xf86-input-evdev-devel-2.10.6-3.10.aarch64.rpm"
RPM_HASH = "fc4ed078772f0811a7eaf3e4235baf86dacc63c67f312d7aa13c02fda7bf62837d143e30a6393f430071b52737fa6f056dd477e8524174b1516b6df5087fa51a"

RPROVIDES:${PN} += "pkgconfig(xorg-evdev) xf86-input-evdev-devel xf86-input-evdev-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config xf86-input-evdev"

inherit rpm
