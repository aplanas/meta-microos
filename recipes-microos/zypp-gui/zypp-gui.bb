SUMMARY = "Update the system, search, install and remove the package, configure the repos."
DESCRIPTION = "Application can update the system, search, install and remove the package, configure the repos. It achieves some functions of command zypper."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2"

RPM_NAME = "zypp-gui-0.1.2-2.10.aarch64.rpm"
RPM_HASH = "aeac3e4bba0d52b806dfea3a3ee657ab70c845949aab2d05d5ac3d85d932c398d485cc589c01823c559e52c5ac407eafb32be6d5b2cdfed73edd2b733307efb9"

RPROVIDES:${PN} += "application() application(zypp.gui.desktop) metainfo() metainfo(zypp.gui.metainfo.xml) zypp-gui zypp-gui(aarch-64)"
RDEPENDS:${PN} += "PackageKit libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libpackagekit-glib2.so.18()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
