SUMMARY = "Python Support for the DjVu Image Format (Documentation)"
DESCRIPTION = "python-djvulibre is a set of Python bindings for the DjVuLibre library, \
an open source implementation of DjVu. \
 \
This package contains technical documentation."
LICENSE = "GPL-2.0-only"

PV = "0.8.6"

RPM_NAME = "python-djvulibre-doc-0.8.6-2.12.noarch.rpm"
RPM_HASH = "86fe6b4755214aebf6b296575249e6130b4d91ec6819582db1b21fc025f59c9274fd7d2f08fc27c7ddab3b0d8217dfdb841317ea882f22eb0620769dd426d435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-djvulibre-doc"
RDEPENDS:${PN} += ""

inherit rpm
