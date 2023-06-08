SUMMARY = ".NET/C# Bindings for GIO"
DESCRIPTION = "Files for developing programs that use gio-sharp"
LICENSE = "GPL-2.0 & MIT"

PV = "2.22.3"

RPM_NAME = "gio-sharp-devel-2.22.3-24.22.aarch64.rpm"
RPM_HASH = "9876bea7b4e62247e54f6782bd5b30b3b924ba944995ac5108d459dfb43ab2170c65baf4ec584944cfb7306e611040f1cc818c82704aa9e7b5740cf67932736a"

RPROVIDES:${PN} += "gio-sharp-devel gio-sharp-devel(aarch-64) pkgconfig(gio-sharp-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gio-sharp pkgconfig(glib-sharp-2.0)"

inherit rpm
