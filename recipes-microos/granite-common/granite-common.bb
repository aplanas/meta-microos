SUMMARY = "Common files for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains the common files needed by the library."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-common-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "ace7b085558efe294094f5ba6d8b345f29b49245efa37639a4d134e676ac409fd0d396f999839ae9829e24daf2062b90bcf7fde17b2e919e6282a20329daacac"

RPROVIDES:${PN} += "granite-common granite-common(aarch-64) metainfo() metainfo(granite.appdata.xml)"
RDEPENDS:${PN} += ""

inherit rpm
