SUMMARY = "Library for messages"
DESCRIPTION = "This package contains source headers for messagelib."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "messagelib-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e3953e737ca0263ba247abe5dcbdce999056c51b1ad7b219d066e3b52a4f6294258cc35a12e8a00212792fa65de1ac4694e26f92b174afddf16b89e00c5165ad"

RPROVIDES:${PN} += "cmake(KPim5MessageComposer) cmake(KPim5MessageCore) cmake(KPim5MessageList) cmake(KPim5MessageViewer) cmake(KPim5MimeTreeParser) cmake(KPim5TemplateParser) cmake(KPim5WebEngineViewer) messagelib-devel messagelib-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Contacts) cmake(KF5Libkleo) cmake(KF5PimCommon) cmake(KPim5Akonadi) cmake(KPim5AkonadiMime) cmake(KPim5IdentityManagement) cmake(KPim5Mime) cmake(Qt5WebEngineWidgets) messagelib"

inherit rpm
