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

PV = "2.40.1"

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "993f85b6760d2cf4be690fa386b3f692fd4e21e12ee41bcb4cdc6b9a4abb6da415692c39b08d44aa9d545abdecec90a539b373ac997f2f45003c9ea3bc96a28b"

RPROVIDES:${PN} += "typelib(JavaScriptCore) typelib-1_0-JavaScriptCore-6_0 typelib-1_0-JavaScriptCore-6_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
