SUMMARY = "Library to download and display gravatars"
DESCRIPTION = "This package contains the debug categories for the libgravatar library."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libgravatar-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7a8ea3f58622fb1100c7b5a52d6b248b4cc3e597d15813eb03c9dfb54960dd2124d5ab6d4748c0d632dc16e394575e00d2dc8c66db9ea228476410c8f3db105e"

RPROVIDES:${PN} += "libgravatar libgravatar(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
