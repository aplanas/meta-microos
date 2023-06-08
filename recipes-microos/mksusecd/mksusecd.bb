SUMMARY = "Tool to create SUSE Linux installation ISOs"
DESCRIPTION = "This is a tool to create SUSE Linux installation ISOs."
LICENSE = "GPL-3.0+"

PV = "2.10"

RPM_NAME = "mksusecd-2.10-1.1.aarch64.rpm"
RPM_HASH = "a5fa65b628cf17e65b32c8303227dd5b8dff3188128c09a6f03a24ce461cc985600021201fbc50d6063a3ffe17c9100bb648630d9444613737602de545dd3f3c"

RPROVIDES:${PN} += "mksusecd mksusecd(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl checkmedia createrepo-implementation dosfstools gpg2 libc.so.6(GLIBC_2.34)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) mkisofs mtools squashfs xz"

inherit rpm
