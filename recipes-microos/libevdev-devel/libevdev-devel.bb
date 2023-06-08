SUMMARY = "Development files for libevdev library"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Development files for libevdev library"
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "libevdev-devel-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "0fc5838e8c082ada020b7033667aeea30afbfece0116161f0601366fbba64be63abd32db56e227ca1e6dd6eb5736924712738cd23aba99e59884858a993a2564"

RPROVIDES:${PN} += "libevdev-devel libevdev-devel(aarch-64) pkgconfig(libevdev)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libevdev2"

inherit rpm
