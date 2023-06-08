SUMMARY = "Additional Package Documentation for ntp"
DESCRIPTION = "The complete set of documentation for building and configuring an NTP \
server or client. The documentation is in the form of HTML files \
suitable for browsing and contains links to additional documentation at \
various web sites. \
 \
What about NTP? Understanding and using the Network Time Protocol (A \
first try on a non-technical Mini-HOWTO and FAQ on NTP). Edited by \
Ulrich Windl and David Dalton."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p15"

RPM_NAME = "ntp-doc-4.2.8p15-13.1.aarch64.rpm"
RPM_HASH = "1e4e8fbf89325b5740ece8c9bb4df24bc86c34fa364ad1d38edb600f1231db5267cd842f1c576ee9d5795ae52804b43475227c4c6add1da17e9838b13800b1cb"

RPROVIDES:${PN} += "ntp-doc ntp-doc(aarch-64) ntpdoc xntp-doc xntpdoc"
RDEPENDS:${PN} += ""

inherit rpm
