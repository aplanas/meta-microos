SUMMARY = "Development files and tools for mozjs78"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "mozjs78-devel-78.15.0-2.8.aarch64.rpm"
RPM_HASH = "2ba3485f3039bb1f9aa24d1629946a8f393c551a300a4e8bd69211cbd00e247432f957329455960eec2a4ff6c6479f89fe10282d4b7f38be8816d94e234d9db1"

RPROVIDES:${PN} += "mozjs78-devel mozjs78-devel(aarch-64) pkgconfig(mozjs-78)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmozjs-78-0 pkgconfig"

inherit rpm
