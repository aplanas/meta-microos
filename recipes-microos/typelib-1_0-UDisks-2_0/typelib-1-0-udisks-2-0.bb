SUMMARY = "Introspection bindings for the UDisks Client Library version 2"
DESCRIPTION = "UDisks provides a daemon, D-Bus API and command line tools \
for managing disks and storage devices. \
 \
This package provides the GObject Introspection bindings for \
the UDisks client library."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "typelib-1_0-UDisks-2_0-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "c73cf2e57a1b2a76018f459a5438a7243de52d954f4cb952e5dfd4e52a4752789eefddae905743beaf2b9b014647fa4f3493b50a83ce730c2280e76c5d36e254"

RPROVIDES:${PN} += "typelib(UDisks) typelib-1_0-UDisks-2_0 typelib-1_0-UDisks-2_0(aarch-64)"
RDEPENDS:${PN} += "libudisks2.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
