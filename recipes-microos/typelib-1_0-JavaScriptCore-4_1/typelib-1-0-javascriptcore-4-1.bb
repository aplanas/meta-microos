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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "31499532d4c5c11e22feacabd40465745cc0fc87d4f85c8c3ce53e791d9abaf91b52d185c8799bbeb446eef1408eb85c9f23b0461cdda8f1f596a6e2e56cab26"

RPROVIDES:${PN} += "typelib(JavaScriptCore) typelib-1_0-JavaScriptCore-4_1 typelib-1_0-JavaScriptCore-4_1(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
