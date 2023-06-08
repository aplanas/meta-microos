SUMMARY = "Utility for Controlling Magnetic Tape Drives"
DESCRIPTION = "mt-st tools contains two programs: mt and stinit, used for dealing \
with Linux-specific tape-drive handling. mt program is tailored for \
SCSI tape drives, but it can also be used with other Linux tape \
drivers that use the same ioctls. The program stinit is meant for \
initializing of SCSI tape drive modes at system startup, or when \
new tape drivers are added."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "mt-st-1.4-1.9.aarch64.rpm"
RPM_HASH = "cb85d17828788e6b7ea2babe3016d8e0ef719a42aa9f6b5d0a9d16c951277c9d978dea0a34c7a3785e00f9e2329a96fad9ca03037b9e16573c563ea886598308"

RPROVIDES:${PN} += "config(mt-st) mt mt-st mt-st(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) udev update-alternatives"

inherit rpm
