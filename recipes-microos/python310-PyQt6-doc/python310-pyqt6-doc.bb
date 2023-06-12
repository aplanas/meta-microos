SUMMARY = "Examples for python310-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-doc-6.5.0-1.2.noarch.rpm"
RPM_HASH = "ba0d04e3d473e1623fefc3d23a6ea345a6fb6dae5caa191f363dbb36b693b54bdc836cfd978ccf407305a2ae2231dd99f90223a2e1ef04c1703f35a82095f5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt6-doc python3-qt6-doc python310-PyQt6-doc python310-qt6-doc"
RDEPENDS:${PN} += ""

inherit rpm
