SUMMARY = "Portable Archive Exchange"
DESCRIPTION = "pax is an archiving utility specified by POSIX.1-2001. The format is \
basically tar, but with additional extended attributes."
LICENSE = "CDDL-1.0"

PV = "1.6.1"

RPM_NAME = "spax-1.6.1-47.3.aarch64.rpm"
RPM_HASH = "0e1117d9f39d23896d01044c7f6199aba1c8c29bbf00b0bb39aa262eea669f92c032b3536053d580a474f6b51aac99d05a1fa9d5a1ade90e6da45280aa30a50a"

RPROVIDES:${PN} += "pax \
spax \
spax(aarch-64)"
RDEPENDS:${PN} += "star"

inherit rpm
