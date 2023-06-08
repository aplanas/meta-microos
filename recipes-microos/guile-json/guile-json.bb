SUMMARY = "JSON module for Guile"
DESCRIPTION = "Guile-json is JSON module for Guile. It supports parsing and building \
JSON documents according to the http:://json.org specification. These \
are the main features: \
 \
- Strictly complies to http://json.org specification. \
- Build JSON documents programmatically via macros. \
- Unicode support for strings. \
- Allows JSON pretty printing."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.2"

RPM_NAME = "guile-json-4.7.2-1.2.aarch64.rpm"
RPM_HASH = "5af8d6682f52060d507655f58f750fdd59b478e3e3aa66b9cd0a61b159722e3dcd841ac50e8324a48f45283370f95ed31b9c7b317962030c655c84224b4e2765"

RPROVIDES:${PN} += "guile-json guile-json(aarch-64)"
RDEPENDS:${PN} += "guile"

inherit rpm
