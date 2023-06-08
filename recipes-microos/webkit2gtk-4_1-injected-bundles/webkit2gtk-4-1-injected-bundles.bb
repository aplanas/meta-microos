SUMMARY = "Injected bundles for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "1562d242c0d5febfe94cb592f0353ba2b50d89af7fea4f3f030fafb256556655d7b9307c6343f36ab5c4b53f7cda19da72e881158b7dfa586e099ff28a86d6d5"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so()(64bit) webkit2gtk-4_1-injected-bundles webkit2gtk-4_1-injected-bundles(aarch-64)"
RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0()(64bit)"

inherit rpm
