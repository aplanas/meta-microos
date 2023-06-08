SUMMARY = "Examples for python310-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-doc-5.15.9-1.6.noarch.rpm"
RPM_HASH = "e3cee3154d80fcf763e63b4a6c095f975e0c49e18a48d124a8f4bec9d995b91d4af22c3ec3e4806beb97cfebe70817da50eb5c63ce741464cc52bcc4b2f447b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt5-doc python3-qt5-doc python310-PyQt5-doc python310-qt5-doc"
RDEPENDS:${PN} += ""

inherit rpm
