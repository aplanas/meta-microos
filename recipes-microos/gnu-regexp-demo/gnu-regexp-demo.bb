SUMMARY = "Java NFA regular expression engine (demo and samples)"
DESCRIPTION = "Demonstrations and samples for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-demo-1.1.4-293.13.noarch.rpm"
RPM_HASH = "6914904dbb6dc4f4e3e951b4b22d85c5079bf774ba7b2bb8c9502b46d04cde2f507286ed301d7c2c0d784a2bd38c4c9c2cb509107980a33f92b199bcc0ed4300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-demo"
RDEPENDS:${PN} += "gnu-getopt gnu-regexp"

inherit rpm
