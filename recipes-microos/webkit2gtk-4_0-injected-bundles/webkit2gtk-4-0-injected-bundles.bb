SUMMARY = "Injected bundles for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "ceb716e913f3c8da10182dcfba2bdc7c81b1520364dceaa2f2750c98c180b6e473d9f58d56b349380c6aa4bc2dd4828b9c72adc932a47f4859b61ac495230bd3"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so()(64bit) webkit2gtk-4_0-injected-bundles webkit2gtk-4_0-injected-bundles(aarch-64)"
RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
