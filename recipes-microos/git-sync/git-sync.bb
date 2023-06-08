SUMMARY = "One-script git synchronization"
DESCRIPTION = "This script synchronizes, almost automatically, 'tracking' repositories \
where a nice history is not as crucial as having one at all."
LICENSE = "CC0-1.0"

PV = "0.0.0~git20151024.eb9adaf"

RPM_NAME = "git-sync-0.0.0~git20151024.eb9adaf-2.11.noarch.rpm"
RPM_HASH = "35a774c78076f4e3117f589099a7cddaaa82d044e227520197bcaf94f902ac4742c06afff61ee837d33e0b2693d78cc790f4441bd1b2f78bd6ae1f11e28a871f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-sync"
RDEPENDS:${PN} += "/bin/bash git-core"

inherit rpm
