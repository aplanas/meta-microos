SUMMARY = "4 Player Mahjongg game"
DESCRIPTION = "Kajongg is a version of the four player Mahjongg tile game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kajongg-23.04.0-1.1.noarch.rpm"
RPM_HASH = "a76f67acef33f866e3cc48f59de8aaa1c406ee9f42c3be7d47303150138aa0e7528a3e0918fe1af51a34371f6bd29d5b24f70217ec6c276c70dd92bd89ba7a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.kde.kajongg.desktop) kajongg metainfo() metainfo(org.kde.kajongg.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/env python3-Twisted python3-qt5"

inherit rpm
