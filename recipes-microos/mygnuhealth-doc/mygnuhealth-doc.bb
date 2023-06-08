SUMMARY = "Documentation files for MyGNUHealth"
DESCRIPTION = "This package includes the documentation for MyGNUHealth Personal Health \
Information Management System for Desktop and Mobile Devices"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "mygnuhealth-doc-1.0.5-2.6.noarch.rpm"
RPM_HASH = "d6ce3fd20c2553be52ae551ef6ab74a6671d8f867f52bedaf738dfdd48edbc11e44f354535c3eeee3233ed7ec6c2eab9ed18fd72c501100c5ff5b9293827cd56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mygnuhealth-doc"
RDEPENDS:${PN} += ""

inherit rpm
