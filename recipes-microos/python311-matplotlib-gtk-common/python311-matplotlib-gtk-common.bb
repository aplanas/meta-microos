SUMMARY = "Code common for GTK3 and GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk-common-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "7e5d88d9f5b8e9866107a16843871d8ca005d8674bc5e6635674073f5f594a3ef1c3f531b43a7f6d54e0ff3fa4d393e006fbed5b87f3b6b8dcc08aa04e2b29da"

RPROVIDES:${PN} += "python311-matplotlib-gtk-common python311-matplotlib-gtk-common(aarch-64)"
RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg python(abi) python311-gobject-Gdk python311-gobject-cairo python311-matplotlib python311-matplotlib-cairo"

inherit rpm
