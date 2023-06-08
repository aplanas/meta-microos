SUMMARY = "Files requires by libKPim5Tnef5"
DESCRIPTION = "Files that can't be in the libKPim5Tnef5 package anymore."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktnef-common-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "995ba0e989c5e22e54bec2d2ad4a8e87c1a85eebd868a746860b7e75af6d217e301fc8e5e4b635dfde104dfc5f029b842feb3beb7addb4a9206c9b1c10b7ed74"

RPROVIDES:${PN} += "ktnef-common ktnef-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
