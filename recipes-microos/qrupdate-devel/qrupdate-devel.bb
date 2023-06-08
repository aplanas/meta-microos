SUMMARY = "Development files for qrupdate library"
DESCRIPTION = "This package contains the development files for the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-devel-1.1.2-3.31.aarch64.rpm"
RPM_HASH = "3bdb4c7cc4aae4749dfd1a260e1b2421bc12bb739dc9e3bded8d7f83fd9e08471762265dba6f6c9d3e47513b4b3ce10aeb4b1916f464078732fa99d5d5b55f9b"

RPROVIDES:${PN} += "qrupdate-devel qrupdate-devel(aarch-64)"
RDEPENDS:${PN} += "libqrupdate1"

inherit rpm
