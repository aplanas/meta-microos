SUMMARY = "Go packages for low-level interaction with the operating system"
DESCRIPTION = "This repository holds supplemental Go packages for low-level interactions with \
the operating system."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20200420.1957bb5"

RPM_NAME = "golang-org-x-sys-0.0.0+git20200420.1957bb5-1.14.aarch64.rpm"
RPM_HASH = "3b20c6c4d0f4404e8ce558dc8719abc7e625363a935458bb328f8cbe15a7f2a1dde4c3cc7060ad031cc1005afe623fdb3374bde038883c35e6abac6de7983d66"

RPROVIDES:${PN} += "golang-org-x-sys golang-org-x-sys(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
