SUMMARY = "Documentation for texlive-simpleinvoice"
DESCRIPTION = "This package includes the documentation for texlive-simpleinvoice"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn45673"

RPM_NAME = "texlive-simpleinvoice-doc-2023.201.svn45673-53.1.noarch.rpm"
RPM_HASH = "0bc12f6905fadaf02c2ef51989b1fda5ae1aa6e7175019bc3e6e0c74be4bfa9e03150342faa0f2afc75944ae7ce44a1f6ccf43706b25e9deec362e31fdc8399f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleinvoice-doc"
RDEPENDS:${PN} += ""

inherit rpm
