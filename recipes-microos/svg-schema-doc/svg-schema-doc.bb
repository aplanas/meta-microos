SUMMARY = "Documentation of SVG Schemas"
DESCRIPTION = "SVG DTD and RELAX NG Schema Documentation in HTML"
LICENSE = "BSD-3-Clause"

PV = "20030114"

RPM_NAME = "svg-schema-doc-20030114-123.11.noarch.rpm"
RPM_HASH = "58762844c3966f80a8c3f6c8f0a27a6702d1b7c238f135c4f8b28036c4f2faa4307e8e649a054de8fab7285e9f8eef61d8f1fe47f8009dd46733607c164b457d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "svg-schema-doc"
RDEPENDS:${PN} += ""

inherit rpm
