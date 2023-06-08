SUMMARY = "Examples for python39-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-doc-6.5.0-1.1.noarch.rpm"
RPM_HASH = "d4b3694f870b6ee7919a8f485b3888f968d9168fcbc77f216ed11802054e4e7e89faacfedd8f5a1a53f62a5cccca8b3179e6a7c549bf24642ab30b9cd80b0920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt6-doc python39-qt6-doc"
RDEPENDS:${PN} += ""

inherit rpm
