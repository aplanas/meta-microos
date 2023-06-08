SUMMARY = "Examples for littleb"
DESCRIPTION = "LittleB provides a Bluetooth Low Energy API. It exposes the BLE GATT \
API for C using BlueZ over SD-Bus. \
 \
This package contains examples for littleb."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "littleb-examples-0.1.2-1.22.aarch64.rpm"
RPM_HASH = "a84b54c723518dd16725298c875e2cda4361e8cfcb45b88ae5b0d81e1487e06659a5614080830d8aff6f118f2a3a92021c90be388d2a5f4beee5754993f16f75"

RPROVIDES:${PN} += "littleb-examples littleb-examples(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
