SUMMARY = "A circular application launcher for GNOME"
DESCRIPTION = "GNOME-Pie is a circular application launcher (pie menu). \
It is made of several pies, each consisting of multiple slices. \
The user presses a key stroke which opens the desired pie. By \
activating one of its slices, applications may be launched, key \
presses may be simulated or files can be opened."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "gnome-pie-0.7.3-1.4.aarch64.rpm"
RPM_HASH = "0c7a5fb933cc290cad659ce101e481d8ddeff9cd97d2f77ff2c3f2cb35735d9db9eea98d260c2bcd10992691e48708252324a1504feb6c628422d56a42b97647"

RPROVIDES:${PN} += "application() application(gnome-pie.desktop) gnome-pie gnome-pie(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libappindicator3.so.1()(64bit) libarchive.so.13()(64bit) libbamf3.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-menu-3.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libwnck-3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit)"

inherit rpm
