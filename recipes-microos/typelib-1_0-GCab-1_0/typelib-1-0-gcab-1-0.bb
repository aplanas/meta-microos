SUMMARY = "Introspection bindings for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package contains the introspection files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "typelib-1_0-GCab-1_0-1.5-1.5.aarch64.rpm"
RPM_HASH = "85e67611f1ddf784d17ec777028523b4d66ef46c3a415b4a53d4b997a29486b880d2a89b05bb34a6e4eb94374052c04e18901ef463f627ebe0a889dd54e1488e"

RPROVIDES:${PN} += "typelib(GCab) typelib-1_0-GCab-1_0 typelib-1_0-GCab-1_0(aarch-64)"
RDEPENDS:${PN} += "libgcab-1.0.so.0()(64bit) typelib(GLib) typelib(GObject) typelib(Gio)"

inherit rpm
