SUMMARY = "Lib for resource discovery and announcement over SSDP - Introspection bindings"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP. \
 \
This package provides the GObject Introspection bindings for gssdp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "typelib-1_0-GSSDP-1_0-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "4ce04b8c39f365aa45479f888f73ccb078db62d0b0d2b9d576a99040053314e05051620abcf0f4a0e769bf303b24ef1e36cb99f7c840fa6e047c96444663663e"

RPROVIDES:${PN} += "typelib(GSSDP) \
typelib-1_0-GSSDP-1_0 \
typelib-1_0-GSSDP-1_0(aarch-64)"
RDEPENDS:${PN} += "libgssdp-1.6.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Soup)"

inherit rpm
