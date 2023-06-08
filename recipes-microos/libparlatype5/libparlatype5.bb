SUMMARY = "Library for parlatype"
DESCRIPTION = "Parlatype ships its own library, libparlatype, which provides a GStreamer backend (PtPlayer) and a waveviewer widget (PtWaveviewer) which is a GtkWidget."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "libparlatype5-3.1-1.7.aarch64.rpm"
RPM_HASH = "abce5989cdf65b3aa040ad99e4134ffe8b23f1a40e8e729e31fede4128f35bb11e614930caf19672a93b0175624662d4793079e61c450d7217eb75af07adb4c8"

RPROVIDES:${PN} += "libparlatype.so.5()(64bit) libparlatype5 libparlatype5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
