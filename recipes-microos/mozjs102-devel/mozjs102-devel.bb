SUMMARY = "Development files and tools for mozjs102"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "102.10.0"

RPM_NAME = "mozjs102-devel-102.10.0-2.1.aarch64.rpm"
RPM_HASH = "a2f23412185f6af99e5f115bf713293667fd1a895c6ae7d719a628c525f3c4d9a54c369e0d95dc20656ba5e07b089994b1d396a818857bae0175719bfc7c35c5"

RPROVIDES:${PN} += "mozjs102-devel mozjs102-devel(aarch-64) pkgconfig(mozjs-102)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmozjs-102-0 pkgconfig"

inherit rpm
