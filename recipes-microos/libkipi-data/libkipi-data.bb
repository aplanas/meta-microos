SUMMARY = "KDE Image Plug-In Interface - data files"
DESCRIPTION = "This package contains data files needed by the KDE image plug-in library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.1"

RPM_NAME = "libkipi-data-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b036ff252fc97a09d630726cf9a5fcfda2e0358d2e5963cc8fefec146e396ba8de7a50311ed37ca3c28cde5166698621aaa038e9d83fe57a15512afa8af395d9"

RPROVIDES:${PN} += "libkipi-data libkipi-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
