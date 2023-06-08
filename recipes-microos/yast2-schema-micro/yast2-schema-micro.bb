SUMMARY = "YaST2 - AutoYaST Schema for Micro"
DESCRIPTION = "AutoYaST Syntax Schema for Micro product"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-schema-micro-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "1442489c49fb10acd63f4c5be2a3d88dbca6e0607b782a50ac89af75f177fecfe844e99d58bc0972926993cb32500ab823ef1ca8e2f5d0093e7c09ad0e39d802"

RPROVIDES:${PN} += "yast2-schema yast2-schema-micro yast2-schema-micro(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
