SUMMARY = "Synaptics touchpad input driver for the Xorg X server -- Development Files"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "xf86-input-synaptics-devel-1.9.2-1.3.aarch64.rpm"
RPM_HASH = "aec0361c6c2a1f78d4f73c60253fe80fedcd8ce9650919b41ac8688c15c2ebb7e4bd4de3672c30eab027a988962cc79883e121cc88ecb4578fecf97e08f95845"

RPROVIDES:${PN} += "pkgconfig(xorg-synaptics) \
xf86-input-synaptics-devel \
xf86-input-synaptics-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
