SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python39-qpageview-0.6.2-1.5.noarch.rpm"
RPM_HASH = "aa25199fa0a3a80ab8de03c8ef01236272a14809cb1ec5f7620b2f4ca4a754f03d52b967f2103a3928075a9ed62b38a8cf19ffc705e80a9e5fc60c9c38c1c5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(qpageview) \
python39-qpageview \
python3dist(qpageview)"
RDEPENDS:${PN} += "python(abi) \
python39-poppler-qt5 \
python39-qt5"

inherit rpm
