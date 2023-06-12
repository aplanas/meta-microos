SUMMARY = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
DESCRIPTION = "A lightweight overlay volume/backlight/progress/anything bar for Wayland"
LICENSE = "ISC"

PV = "0.14.2"

RPM_NAME = "wob-0.14.2-1.2.aarch64.rpm"
RPM_HASH = "4ad1b85c37920081a3083dc336e43d9faa6e55a9ea52faf68c31b49cb22128d52eefea15cb57c2df5957db23f85f7313357648f88f09dc3ef6bc9bcfd53e3e28"

RPROVIDES:${PN} += "wob \
wob(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libinih.so.0()(64bit) \
libseccomp.so.2()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
