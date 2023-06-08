SUMMARY = ".NET/C# Bindings for GIO"
DESCRIPTION = "C#/CLI bindings for GIO"
LICENSE = "GPL-2.0 & MIT"

PV = "2.22.3"

RPM_NAME = "gio-sharp-2.22.3-24.22.aarch64.rpm"
RPM_HASH = "d99c857b6822fa72b56d81eff75ad77147a93e4bbda8bc281f1fc32e05154e72d59a05b1559a2e5ce6242c20b7a6aca437633d6b5b64a15c2231d5daa1426958"

RPROVIDES:${PN} += "gio-sharp gio-sharp(aarch-64) mono(gio-sharp)"
RDEPENDS:${PN} += "glib-sharp2 glib2 mono(System) mono(glib-sharp) mono(mscorlib) mono-core"

inherit rpm
