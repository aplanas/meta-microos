SUMMARY = "Documentation for qt6-quickeffectmaker in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quickeffectmaker-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "023b60d3ffbbdd328f29f29d5e7bf2ffa725005e83752ec2c5789a846512c066c45cf0c64897fb90d8018325354e50722c7b9bb78cd174517f7709b3f22e7f1e"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-html qt6-quickeffectmaker-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
