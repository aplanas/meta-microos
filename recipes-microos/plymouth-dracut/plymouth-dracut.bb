SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "ad27689723108624896382a2daf3b0a33812b4e83700c5d1d1495f42ff348f3abae88a3d1657503197421659f37cf1001d9547fb33ec82081166a59eaa484d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"
RDEPENDS:${PN} += "/bin/bash plymouth"

inherit rpm
