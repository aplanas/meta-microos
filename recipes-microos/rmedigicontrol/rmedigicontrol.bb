SUMMARY = "GUI control tool for RME Digi32 and RME Digi96 soundcards"
DESCRIPTION = "Rmedigicontrol is a control tool for RME Digi32 and RME Digi96 soundcards. \
It depends on ALSA and GTK+ and offers a graphical frontend for all your \
switches."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.5a"

RPM_NAME = "rmedigicontrol-0.3.5a-24.3.aarch64.rpm"
RPM_HASH = "f130ca8b1bbaff0b0a3589deb59b3b002b0a73e14d6fc6d60a3be7e7ae56e673468a4f895062f89fff04417a082e2c70988deda9fdd86f0c6eb1fbcd708bbf16"

RPROVIDES:${PN} += "alsa-tools-gui:/usr/bin/rmedigicontrol \
application() \
application(rmedigicontrol.desktop) \
rmedigicontrol \
rmedigicontrol(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
