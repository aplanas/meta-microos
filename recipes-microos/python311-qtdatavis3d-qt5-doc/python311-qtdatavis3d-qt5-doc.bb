SUMMARY = "Examples for python311-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python311-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-doc-5.15.5-1.5.noarch.rpm"
RPM_HASH = "b920e0678aac9d4e7e6b7f09e209780eb1051f9ecfb536716c5eeb996772ae2f048d0768faa7b0ee8dcbe2983c7a18c124104b5cc36aad8b42e1e535ae606932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtdatavis3d-qt5-examples \
python311-qtdatavis3d-qt5-doc \
python311-qtdatavis3d-qt5-examples \
python39-qtdatavis3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
