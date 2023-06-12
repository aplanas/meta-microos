SUMMARY = "Examples for python39-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-doc-6.5.0-1.2.noarch.rpm"
RPM_HASH = "e7e8fac4b0a67ca4c02f949b70ad87945dd9be10ce0613a1aac95762504019a0cc5488a0bc4111d4bfc823d76e3c52c4189dde165cd6e30c06272b8fa8af7d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt6-doc python39-qt6-doc"
RDEPENDS:${PN} += ""

inherit rpm
