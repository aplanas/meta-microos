SUMMARY = "GObject introspection files for the Rygel renderer library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRenderer-2_8-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "268580cf568fbd362545df4f208e9488e02fe6619e8a0d9e85bdbe9c7f0d43ff768a8e45c401461801c9bc1e1a3c73adab5f634a4508efbe18845e63c9f22f07"

RPROVIDES:${PN} += "typelib(RygelRenderer) \
typelib-1_0-RygelRenderer-2_8 \
typelib-1_0-RygelRenderer-2_8(aarch-64)"
RDEPENDS:${PN} += "typelib(GLib) \
typelib(GObject) \
typelib(GSSDP) \
typelib(GUPnP) \
typelib(GUPnPAV) \
typelib(Gee) \
typelib(Gio) \
typelib(RygelCore) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
