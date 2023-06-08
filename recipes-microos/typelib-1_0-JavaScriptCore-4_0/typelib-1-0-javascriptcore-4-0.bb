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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "48f6bf3cb9e04c29ee090b699bb057e7d420ff0b6350222a4072025245e6bcdac3eec60944d58c92258e563e7521e9575305e01bc40ab44a02eafe6f8bd1f644"

RPROVIDES:${PN} += "typelib(JavaScriptCore) typelib-1_0-JavaScriptCore-4_0 typelib-1_0-JavaScriptCore-4_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18()(64bit) typelib(GLib) typelib(GObject)"

inherit rpm
