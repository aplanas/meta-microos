SUMMARY = "KDE Image Plug-In Interface - data files"
DESCRIPTION = "This package contains data files needed by the KDE image plug-in library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.0"

RPM_NAME = "libkipi-data-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d2e9523e4359e225da59c118efdbeefb4a20d6cdaceee89d1791c186e4b0f6a32dd4d647038477b91135179e6f45689b45b1a0d7dd7577c7ac85805582b3f646"

RPROVIDES:${PN} += "libkipi-data libkipi-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
