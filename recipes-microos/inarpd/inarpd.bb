SUMMARY = "Inverse ARP daemon for Linux"
DESCRIPTION = "Inverse ARP (InARP) daemon for Linux."
LICENSE = "GPL-2.0-only"

PV = "0.17"

RPM_NAME = "inarpd-0.17-1.9.aarch64.rpm"
RPM_HASH = "f08cc4bafd4292b197f5a45b3154b6efa820b037b1dcb204955d0da4deb911be0d2d29fe0c06a73f8f080f16fefe6ab875b5947e22ee4d980b00c826ff97f120"

RPROVIDES:${PN} += "inarpd inarpd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
