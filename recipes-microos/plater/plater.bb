SUMMARY = "RepRap STL plater"
DESCRIPTION = "Plater is a GUI tool to prepare printing plate from STL files for ReRap. \
It is a part of Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "plater-2.0.0~rc7.1599393390.c451359-3.12.noarch.rpm"
RPM_HASH = "91a8d3ffa6e4d3c92021d3fb9c8b168f45b09e5538149f973d9b6a4ea5eb9b06b6801a0d9c5cbdd49e2a2d1a3e6204aa1bec4e6cbdf8ab6241a2a6529d7c3b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(plater.desktop) metainfo() metainfo(plater.appdata.xml) plater"
RDEPENDS:${PN} += "/usr/bin/python3 Printrun-common python3-wxPython"

inherit rpm
