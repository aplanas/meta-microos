SUMMARY = "Introspection bindings for the GTK+ port of the JavaScript Core Engine"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of the JavaScript Core engine."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "8655d2ad868441208ae89d1dcdca4e57e53033e049778f33e2f40b744801cd8107a53e71dceea158fb3ea6a3d9d9100e86d216a1f4bc83e66220634769da9832"

RPROVIDES:${PN} += "typelib(JavaScriptCore) \
typelib-1_0-JavaScriptCore-4_0 \
typelib-1_0-JavaScriptCore-4_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
