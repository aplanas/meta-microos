SUMMARY = "Documentation for qt6-mqtt in HTML format"
DESCRIPTION = "This package contains documentation for qt6-mqtt in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-mqtt-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d777184d085c568f8bedb6ee42d49fee951e7d07fd74855d4c7abf73a84550fb45dfa3982e1c38630d02cad715ac3ec7dc0987da2519ab374e29380cf3231df6"

RPROVIDES:${PN} += "qt6-mqtt-docs-html qt6-mqtt-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
