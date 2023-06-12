SUMMARY = "Golang security checker"
DESCRIPTION = "Inspects source code for security problems by scanning the go abstract syntax tree."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "gosec-2.16.0-1.1.aarch64.rpm"
RPM_HASH = "d3c9e34bc01c7fe0b06e08a619b59f5195561e07189007d8ca14f6091073405b5d05f987569ed32597234abdb7a3f01139bb807eee55a873193061b1ccd09b76"

RPROVIDES:${PN} += "gosec gosec(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
