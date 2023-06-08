SUMMARY = "Documentation for qt6-wayland in HTML format"
DESCRIPTION = "This package contains documentation for qt6-wayland in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-wayland-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f4ff4af68f3c7286be67b004344c354cffaf12a08df3da47a3582e938f7ca527e6c8f815776df62b7f83f1e3a073fcb75cba7c2994d22a649c0459d0f8a48870"

RPROVIDES:${PN} += "qt6-wayland-docs-html qt6-wayland-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
