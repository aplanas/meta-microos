SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is the window manager of the K desktop environment. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "kwin5-devel-5.27.4-2.2.aarch64.rpm"
RPM_HASH = "3d19c3e408fd9975ae2522b37198f96efa1eadda01f48a96e6c270008ac1cca0e8e69788be5b1fff7d3d702f527368405e4939fec4e0355413afbb7d4c67a0b7"

RPROVIDES:${PN} += "cmake(KWinDBusInterface) cmake(KWinEffects) kwin5-devel kwin5-devel(aarch-64)"
RDEPENDS:${PN} += "kwin5 libepoxy-devel libkdecoration2-devel"

inherit rpm
