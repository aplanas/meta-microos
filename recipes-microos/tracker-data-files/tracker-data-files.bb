SUMMARY = "Data files for the Tracker Miners"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This subpackage contains the data files for the Tracker miners."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-data-files-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "79e839d6e384e1a780d72b4fa5b3d3ca2b295f2f736c969bea5781193b521eca76875fc4240365ce646b9f020b2e5507e873c7be6619d9efcfb1ed5567d380e8"

RPROVIDES:${PN} += "tracker-data-files tracker-data-files(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
