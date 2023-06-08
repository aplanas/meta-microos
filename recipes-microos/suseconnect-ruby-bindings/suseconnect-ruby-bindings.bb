SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "suseconnect-ruby-bindings-1.1.0~git0.e3c41e60892e-1.1.aarch64.rpm"
RPM_HASH = "bb29e9a356d9c48e1756e4d30d379a038b2b0b7a44d6464f1d5d7f9d8a04e845cfed63a847da5a1964c6f75f8c92566ffea16c9200a2fb44eb150f450d0616c6"

RPROVIDES:${PN} += "suseconnect-ruby-bindings suseconnect-ruby-bindings(aarch-64)"
RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
