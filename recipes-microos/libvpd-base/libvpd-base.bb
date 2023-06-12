SUMMARY = "Udev rules for VPD Database access library"
DESCRIPTION = "Udev rules for libvpd library used to access a vpd database created by \
vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-base-2.2.9-3.3.aarch64.rpm"
RPM_HASH = "0a91589961a6da5a95c3bf90494110569d770951804c04ae1910d52bf45225b1e1e7961d5a4af9295162b9ec940c0fbb0cd4bf771ebfcd17ff20e4722968809f"

RPROVIDES:${PN} += "libvpd-base \
libvpd-base(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
