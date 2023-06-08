SUMMARY = "Zope hookable"
DESCRIPTION = "This package contains documentation files for python-zope.hookable."
LICENSE = "ZPL-2.1"

PV = "5.4"

RPM_NAME = "python-zope.hookable-doc-5.4-3.1.noarch.rpm"
RPM_HASH = "ed71aa25ab87cbf9997eca10165f892340ae6d98a8ee70d2f7b1718af3fd73afceebd39924b91d5c6c5418d98cf05d0a299d922b17850e03208abd98e7d78989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.hookable-doc python310-zope.hookable-doc python311-zope.hookable-doc python39-zope.hookable-doc"
RDEPENDS:${PN} += ""

inherit rpm
