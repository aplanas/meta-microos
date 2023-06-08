SUMMARY = "Documentation for qt6-sensors in HTML format"
DESCRIPTION = "This package contains documentation for qt6-sensors in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-sensors-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b7c074065a266fe5cb04d9accea213357147659e0ab0a51c7b8927d8575f8c0d163cd0a05ffbfb90c8117f6f2fe75ae531090666e5686e283beafcd63fa80fb7"

RPROVIDES:${PN} += "qt6-sensors-docs-html qt6-sensors-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
