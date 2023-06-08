SUMMARY = "Miscellaneous terminology themes"
DESCRIPTION = "Miscellaneous themes provided by the terminology devs, includes Solarized, \
Mild and Black themes."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-misc-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "84f28a6b90a3e8e829f8c145ab96e16cd3cfbd4eac1014895a51c0bac7dc76eaa5b0a7287fcee32149b4425c2dcfb29c97244de9c710b4a731f5b7a5436ae47f"

RPROVIDES:${PN} += "terminology-theme terminology-theme-misc terminology-theme-misc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
