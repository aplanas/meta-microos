SUMMARY = "Holiday calculation library"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kholidays-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "db5fb7b898efdfc632b946f53d1f13477110e674943471439b0576471085a26eff128afbcb1dffbd8d7e9762de8f0c7fef88f2edfb6a53dd034921c883addddb"

RPROVIDES:${PN} += "kholidays kholidays(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
