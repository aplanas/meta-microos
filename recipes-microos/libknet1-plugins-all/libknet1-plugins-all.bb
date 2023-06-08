SUMMARY = "Provides libknet1 plugins meta package"
DESCRIPTION = " Meta package to install all of libknet1 plugins"
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-plugins-all-1.21-1.10.aarch64.rpm"
RPM_HASH = "bfe95b1af9dcbac059b4df8c84a246a9f4b7879e49ac47f58bea0131b9237f446450b355fa4771510c760c3b1dba0229825e75af34114d2be0636f14d35b848a"

RPROVIDES:${PN} += "libknet1-plugins-all libknet1-plugins-all(aarch-64)"
RDEPENDS:${PN} += "libknet1-compress-plugins-all(aarch-64) libknet1-crypto-plugins-all(aarch-64)"

inherit rpm
