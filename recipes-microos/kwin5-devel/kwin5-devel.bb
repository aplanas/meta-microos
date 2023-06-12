SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is the window manager of the K desktop environment. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "kwin5-devel-5.27.5-2.2.aarch64.rpm"
RPM_HASH = "4e0bdd6f84697775e0dfb57a09b35ca49cd2e5a47d112546071258224b87c17d233a754b50aca51efc1124faabdee09fc0c2fca326546e6a8d190eb09776a454"

RPROVIDES:${PN} += "cmake(KWinDBusInterface) cmake(KWinEffects) kwin5-devel kwin5-devel(aarch-64)"
RDEPENDS:${PN} += "kwin5 libepoxy-devel libkdecoration2-devel"

inherit rpm
