SUMMARY = "MATE disk image mounter"
DESCRIPTION = "This is the MATE Disk Image Mounter as shipped with the MATE \
utilities. mate-disk-image-mounter shows up in Caja for .ISO files \
to be conviniently mounted."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-disk-image-mounter-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "8179be781c8169aa7303dea5b1a61ccbdce3e5917a5cd795ca2ced500de6c5716e33ed9671de825266b97d8d001908c433662982978421a230de5c7b9094faa4"

RPROVIDES:${PN} += "application() application(mate-disk-image-mounter.desktop) mate-disk-image-mounter mate-disk-image-mounter(aarch-64) mimehandler(application/x-cd-image) mimehandler(application/x-raw-disk-image)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libudisks2.so.0()(64bit)"

inherit rpm
