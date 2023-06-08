SUMMARY = "Library for messages"
DESCRIPTION = "This package contains source headers for messagelib."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "messagelib-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e62c018dfc868042d6fc3a0f82fa04ba533e93c4fef1361ff20870db8d1726e0cc94f4705e7225cf4413c4a912be80cf512f67474f7f4566a2b3dc808df0ef72"

RPROVIDES:${PN} += "cmake(KPim5MessageComposer) cmake(KPim5MessageCore) cmake(KPim5MessageList) cmake(KPim5MessageViewer) cmake(KPim5MimeTreeParser) cmake(KPim5TemplateParser) cmake(KPim5WebEngineViewer) messagelib-devel messagelib-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Contacts) cmake(KF5Libkleo) cmake(KF5PimCommon) cmake(KPim5Akonadi) cmake(KPim5AkonadiMime) cmake(KPim5IdentityManagement) cmake(KPim5Mime) cmake(Qt5WebEngineWidgets) messagelib"

inherit rpm
