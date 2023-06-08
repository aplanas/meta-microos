SUMMARY = "Introspection bindings for babl"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
This package provides the GObject Introspection bindings for babl."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.102"

RPM_NAME = "typelib-1_0-Babl-0_1-0.1.102-2.3.aarch64.rpm"
RPM_HASH = "ee87ed52c03ee1d23081ff5e618ecb133bdbedf40f9ad5767bae892ec0cab434023f18d63d5a2a0bba209e616e058a0ee8c8641393972c2a71369d5cc3a45b55"

RPROVIDES:${PN} += "typelib(Babl) typelib-1_0-Babl-0_1 typelib-1_0-Babl-0_1(aarch-64)"
RDEPENDS:${PN} += "libbabl-0.1.so.0()(64bit)"

inherit rpm
