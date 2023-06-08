SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python-zope.event-doc-4.6-3.1.noarch.rpm"
RPM_HASH = "04d512a9285beb101a49f905b299fd13cc1fc4ed058dbf2c3db9231642f923db093702f65da73d61d4f3b000595c7a73a173903cec39c3fc454defd267e039fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"
RDEPENDS:${PN} += ""

inherit rpm
