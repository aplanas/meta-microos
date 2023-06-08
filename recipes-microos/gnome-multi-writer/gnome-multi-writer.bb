SUMMARY = "Program for writing an ISO file to multiple USB devices at once"
DESCRIPTION = "GNOME MultiWriter can be used to write an ISO file to multiple USB devices \
at once. \
Supported drive sizes are between 1Gb and 32Gb. \
 \
MultiWriter may be useful for QA testing, to create a GNOME Live image \
or a code sprint or to create hundreds of LiveUSB drives for a trade show."
LICENSE = "GPL-2.0-or-later"

PV = "3.35.90"

RPM_NAME = "gnome-multi-writer-3.35.90-1.15.aarch64.rpm"
RPM_HASH = "dcc4797d76a84437afd4f595e52778bb038e24c22e5988b12b72011d72003654abc0ec7c373ccbb5e9b89394a6575b8560858b9249d2b1de2557329fb16530ec"

RPROVIDES:${PN} += "application() application(org.gnome.MultiWriter.desktop) gnome-multi-writer gnome-multi-writer(aarch-64) metainfo() metainfo(org.gnome.MultiWriter.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcanberra-gtk3.so.0()(64bit) libcanberra.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgudev-1.0.so.0()(64bit) libgusb.so.2()(64bit) libgusb.so.2(LIBGUSB_0.1.0)(64bit) libgusb.so.2(LIBGUSB_0.1.7)(64bit) libgusb.so.2(LIBGUSB_0.2.2)(64bit) libgusb.so.2(LIBGUSB_0.2.4)(64bit) libpolkit-gobject-1.so.0()(64bit) libudisks2.so.0()(64bit)"

inherit rpm
