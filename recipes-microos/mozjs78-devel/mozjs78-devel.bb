SUMMARY = "Development files and tools for mozjs78"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "mozjs78-devel-78.15.0-2.7.aarch64.rpm"
RPM_HASH = "610371b85ffc4c57b0d4d59f5c865e72f0b0bec2c3fa13c884d4a75c4f738599e87e8e437cbd24c6f180fa4ea6275f3c2ec5947d0c82a998c2f25047b22f54dc"

RPROVIDES:${PN} += "mozjs78-devel mozjs78-devel(aarch-64) pkgconfig(mozjs-78)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmozjs-78-0 pkgconfig"

inherit rpm
