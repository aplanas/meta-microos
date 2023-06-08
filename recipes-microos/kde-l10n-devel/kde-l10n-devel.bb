SUMMARY = "Tools for translating DocBook XML files with Gettext"
DESCRIPTION = "This is a collection of tools that facilitate translating DocBook XML \
files using Gettext message files (PO files)."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kde-l10n-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "305503504fcb631ec53df82abfe7f1a936600683382425ad6e2bce62898028fb339b4eb64330961c7aed8ad6f2ac78cc79ad804273ad1528f7866dbcf77d3d56"

RPROVIDES:${PN} += "kde-l10n-devel kde-l10n-devel(aarch-64) kde4-l10n-devel poxml"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgettextpo.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
