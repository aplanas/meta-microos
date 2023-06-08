SUMMARY = "Golang security checker"
DESCRIPTION = "Inspects source code for security problems by scanning the go abstract syntax tree."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "gosec-2.15.0-1.3.aarch64.rpm"
RPM_HASH = "05381822a8a3d86b9299a06f9668ecdbc22a064542b635c5aeb6fc007c4e627a3201dc98e5a990e2408dc577557a7dc58eac59822ba9f80ca490065b0383687d"

RPROVIDES:${PN} += "gosec gosec(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
